package com.graduation.project.IQInterviewKids.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import com.graduation.project.IQInterviewKids.Data.MyServerData;
import com.graduation.project.IQInterviewKids.Data.Question;
import com.graduation.project.IQInterviewKids.QuestionPagerAdapter;
import com.graduation.project.IQInterviewKids.R;
import com.graduation.project.IQInterviewKids.ResultBundle;

import java.util.ArrayList;
import java.util.Arrays;

public class InterViewQuestionActivity extends AppCompatActivity {
    ViewPager pager;
    QuestionPagerAdapter pagerAdapter;
    private TextView questionNr;
    private int totalQuestions;
    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        totalQuestions = MyServerData.getInstance().getTotalNumberInterviewQuestions();

        //initialize number
        questionNr = (TextView) findViewById(R.id.question_number);
        //initialize pager
        pager = (ViewPager) findViewById(R.id.qPager);
        pagerAdapter = new QuestionPagerAdapter(getSupportFragmentManager(), "Interview");
        pager.setAdapter(pagerAdapter);
        pager.setCurrentItem(1, false);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override

            public void onPageSelected(int position) {
                int currentQuestion = pager.getCurrentItem();

                questionNr.setText("" + currentQuestion);
                questionNr.clearFocus();
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(questionNr.getWindowToken(), 0);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                int totalQuestions = MyServerData.getInstance().getTotalNumberInterviewQuestions();
                if (state == ViewPager.SCROLL_STATE_IDLE) {
                    if (pager.getCurrentItem() == totalQuestions + 1) {
                        pager.setCurrentItem(1, false);
                    }
                    if (pager.getCurrentItem() == 0) {
                        pager.setCurrentItem(totalQuestions, false); // false will prevent sliding animation of view pager
                    }
                }
            }
        });

    }

    public void FinishTest(View v) {

        //check if there are unanswered questions
        if (MyServerData.getInstance().getTestState().equals("inProgress")) {
            ArrayList<Integer> UnansweredQuestions = new ArrayList<>();
            Question[] allQuestions = MyServerData.getInstance().getAllInterviewQuestions();

            for (int i = 1; i < allQuestions.length; i++) {
                Boolean[] userAnswers = allQuestions[i].getUserAnswers();
                if (!Arrays.asList(userAnswers).contains(true)) {
                    UnansweredQuestions.add(i);
                }
            }

            if (UnansweredQuestions.size() > 0) {
                dialog = new AlertDialog.Builder(this)
                        .create();
                LayoutInflater infl = LayoutInflater.from(this);
                dialog.setView(infl.inflate(R.layout.message_dialog, null));
                dialog.show();
                TextView messageTextView = (TextView) dialog.findViewById(R.id.message_txt_view);
                String questions = TextUtils.join(",", UnansweredQuestions);

                messageTextView.setText(questions + ".");

                dialog.findViewById(R.id.btn_cancel).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.findViewById(R.id.btn_ok).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        showResults();
                    }
                });
            } else {
                showResults();
            }
        } else {
            showResults();
        }
    }

    public void showResults() {
        Intent intent = new Intent(this, ResultActivity.class);
        ResultBundle resultBundle = (ResultBundle) getIntent().getSerializableExtra(Intent.EXTRA_TEXT);
        resultBundle.MaxScore = totalQuestions;
        resultBundle.ActualResult = getTotalCorrectAnswer();
        resultBundle.Type="Interview Question";
        intent.putExtra(Intent.EXTRA_TEXT, resultBundle);
        startActivity(intent);
    }

    private int getTotalCorrectAnswer() {
        int total = 0;
        for (int i = 0; i < MyServerData.getInstance().getAllInterviewQuestions().length; i++) {
            Boolean isCorrect = Arrays.equals(MyServerData.getInstance().getAllInterviewQuestions()[i].getAllCorrectAnswers(), MyServerData.getInstance().getAllInterviewQuestions()[i].getUserAnswers());
            if (isCorrect) {
                total++;
            }
        }
        return total;
    }
}