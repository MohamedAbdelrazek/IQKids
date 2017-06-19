package com.graduation.project.IQInterviewKids.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.graduation.project.IQInterviewKids.Data.MyServerData;
import com.graduation.project.IQInterviewKids.R;
import com.graduation.project.IQInterviewKids.ResultBundle;

import java.text.DateFormat;
import java.util.Date;

public class ResultActivity extends AppCompatActivity {
    private Button mMainMenu;
    private TextView mResult;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        ResultBundle resultBundle = (ResultBundle) getIntent().getSerializableExtra(Intent.EXTRA_TEXT);

        if (resultBundle.Type.equals("IQ Test")) {
            resultBundle.State = getIQState(resultBundle.ActualResult);

        } else {
            resultBundle.State = getInterViewState(resultBundle.ActualResult);

        }

        resultBundle.Date = DateFormat.getDateTimeInstance().format(new Date());
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("KidsName").child(resultBundle.Name).push().setValue(resultBundle);

        mMainMenu = (Button) findViewById(R.id.main_menu_btn);
        mResult = (TextView) findViewById(R.id.result_txt_view);
        mResult.setText(resultBundle.State + " ~ " + resultBundle.ActualResult + " / " + (resultBundle.MaxScore - 1));

        mMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Main = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(Main);
                MyServerData.getInstance().setTestState("notStarted");
                MyServerData.getInstance().clearAnswers();
                Toast.makeText(getBaseContext(), "Test is Over ! ", Toast.LENGTH_LONG).show();
            }
        });

    }

    private String getInterViewState(int actualResult) {

        if (actualResult >= 18) {
            return "Accepted";
        }
        return "Rejected";
    }


    private String getIQState(int actualResult) {
        if (actualResult >= 30)
            return "Excellent, You  are genius !";
        else if (actualResult >= 20)
            return "Good";
        else return "Failed!";
    }
}
