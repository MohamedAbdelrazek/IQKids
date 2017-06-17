package com.graduation.project.IQInterviewKids;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.graduation.project.IQInterviewKids.Data.MyServerData;

public class QuestionPagerAdapter extends FragmentStatePagerAdapter {
    String mFlag;

    public QuestionPagerAdapter(FragmentManager fm, String flag) {
        super(fm);
        mFlag = flag;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        bundle.putString("flag", mFlag);
        QuestionFragment questionFragment = new QuestionFragment();
        questionFragment.setArguments(bundle);
        return questionFragment;
    }

    @Override
    public int getCount() {
        return MyServerData.getInstance().getTotalNumberIqQuestions();
    }
}
