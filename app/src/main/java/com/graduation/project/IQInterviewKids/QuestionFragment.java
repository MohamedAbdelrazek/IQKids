package com.graduation.project.IQInterviewKids;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.graduation.project.IQInterviewKids.Data.MyServerData;
import com.graduation.project.IQInterviewKids.Data.Question;

public class QuestionFragment extends Fragment {
    LinearLayout answersContainer;
    private Question currentQuestion;

    @Override
    public View onCreateView(LayoutInflater lInflater, ViewGroup container, Bundle saveInstanceState) {
        View rootView = lInflater.inflate(R.layout.fragment_main, container, false);
        int currentQuestionNumber = getArguments().getInt("position");
        String flag = getArguments().getString("flag");

        if (flag == "Interview") {
            currentQuestion = MyServerData.getInstance().getInterviewQuestionNumber(currentQuestionNumber);
        } else {
            currentQuestion = MyServerData.getInstance().getIqQuestionNumber(currentQuestionNumber);
        }

        TextView question = (TextView) rootView.findViewById(R.id.questionText);

        question.setText(currentQuestion.getQuestionText());

        //initialize answers
        answersContainer = (LinearLayout) rootView.findViewById(R.id.answers_container);
        String[] answers = currentQuestion.getAllChooses();
        for (int i = 0; i < answersContainer.getChildCount(); i++) {
            RelativeLayout checkboxContainer = (RelativeLayout) answersContainer.getChildAt(i);
            CheckBox cb = (CheckBox) checkboxContainer.getChildAt(0);
            cb.setMovementMethod(new ScrollingMovementMethod());
            cb.setText(answers[i]);
            cb.setChecked(currentQuestion.isChecked(i));

            cb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox cb = ((CheckBox) v);
                    int number = Integer.parseInt(cb.getHint().toString());
                    currentQuestion.setChecked(number, cb.isChecked());
                }
            });
        }

        return rootView;
    }
}