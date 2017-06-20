package com.graduation.project.IQInterviewKids.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.graduation.project.IQInterviewKids.Data.MyServerData;
import com.graduation.project.IQInterviewKids.R;
import com.graduation.project.IQInterviewKids.ResultBundle;

public class MainActivity extends AppCompatActivity {
    private Button mIqTest;
    private Button mInterviewTest;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener zAuthStateListener;
    private ResultBundle mResultBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIqTest = (Button) findViewById(R.id.iq_test_btn);
        mInterviewTest = (Button) findViewById(R.id.interview_btn);


        mIqTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Quiz = new Intent(getApplicationContext(), IQTestActivity.class);
                MyServerData.getInstance().setTestState("inProgress");
                Quiz.putExtra(Intent.EXTRA_TEXT, mResultBundle);
                startActivity(Quiz);
            }
        });

        mInterviewTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Quiz = new Intent(getApplicationContext(), InterViewQuestionActivity.class);
                MyServerData.getInstance().setTestState("inProgress");
                Quiz.putExtra(Intent.EXTRA_TEXT, mResultBundle);
                startActivity(Quiz);
            }
        });


        mFirebaseAuth = FirebaseAuth.getInstance();
        mResultBundle = new ResultBundle();
        mResultBundle.EmailAddress = mFirebaseAuth.getCurrentUser().getEmail();
        mResultBundle.Name = mFirebaseAuth.getCurrentUser().getDisplayName();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {


            case R.id.sign_out_menu:

                cleanUp();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    private void cleanUp() {

        ProgressDialog pd = new ProgressDialog(MainActivity.this);
        pd.setMessage("loading");
        pd.show();
        AuthUI.getInstance()
                .signOut(this)

                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            startActivity(new Intent(getApplicationContext(), SignInActivity.class));
                            finish();
                        }
                    }
                });
    }
}