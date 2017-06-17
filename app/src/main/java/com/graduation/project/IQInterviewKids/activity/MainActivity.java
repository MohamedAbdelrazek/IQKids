package com.graduation.project.IQInterviewKids.activity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.graduation.project.IQInterviewKids.Data.MyServerData;
import com.graduation.project.IQInterviewKids.R;
import com.graduation.project.IQInterviewKids.ResultBundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private Button mIqTest;
    private Button mInterviewTest;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
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

        zAuthStateListener = new FirebaseAuth.AuthStateListener() {


            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();

                if (user != null) {

                } else {
                    // User is signed out


                    startActivityForResult(
                            AuthUI.getInstance()
                                    .createSignInIntentBuilder().setIsSmartLockEnabled(false)
                                    .setAvailableProviders(
                                            Arrays.asList(new AuthUI.IdpConfig.Builder(AuthUI.EMAIL_PROVIDER).build(),
                                                    new AuthUI.IdpConfig.Builder(AuthUI.GOOGLE_PROVIDER).build())).setLogo(R.drawable.ic_launcher)
                                    .build(),
                            214);

                }
            }
        };

        //exit the app if there is no internet connection !!
        if (!isNetworkConnected()) {
            Toast.makeText(this, "Check your internet connection !", Toast.LENGTH_LONG).show();
            finish();
        }


        mResultBundle = new ResultBundle();
        mResultBundle.EmailAddress = mFirebaseAuth.getCurrentUser().getEmail();
        mResultBundle.Name = mFirebaseAuth.getCurrentUser().getDisplayName();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mFirebaseAuth.addAuthStateListener(zAuthStateListener);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mFirebaseAuth.removeAuthStateListener(zAuthStateListener);
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
                mFirebaseAuth.signOut();
                AuthUI.getInstance()
                        .signOut(this)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            public void onComplete(@NonNull Task<Void> task) {
                                finish();
                            }
                        });
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }

}