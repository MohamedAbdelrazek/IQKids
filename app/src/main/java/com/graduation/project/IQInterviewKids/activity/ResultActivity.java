package com.graduation.project.IQInterviewKids.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.graduation.project.IQInterviewKids.Data.MyServerData;
import com.graduation.project.IQInterviewKids.ResultBundle;
import com.graduation.project.IQInterviewKids.R;

public class ResultActivity extends AppCompatActivity {
    private Button mMainMenu;
    private TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ResultBundle resultBundle = (ResultBundle) getIntent().getSerializableExtra(Intent.EXTRA_TEXT);

        mMainMenu = (Button) findViewById(R.id.main_menu_btn);
        mResult = (TextView) findViewById(R.id.result_txt_view);
        mResult.setText(resultBundle.mActualResult + " / " + (resultBundle.mMaxscore - 1));

        mMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Main = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(Main);
                MyServerData.getInstance().setTestState("notStarted");
                MyServerData.getInstance().clearAnswers();
                Toast.makeText(getBaseContext(),"Test is Over ! ", Toast.LENGTH_LONG).show();
            }
        });

    }
}
