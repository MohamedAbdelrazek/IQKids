package com.graduation.project.IQInterviewKids.Data;

import java.util.Arrays;

public class Question {
    private String question;
    private String[] mListOfchoose;
    private Boolean[] correctAnswer;
    private Boolean[] checked = new Boolean[4];

    Question(String question, String[] answerText, Boolean[] correctAnswer) {
        this.question = question;
        this.mListOfchoose = answerText.clone();
        this.correctAnswer = correctAnswer.clone();
        this.resetChecked();
    }

    public void setChecked(int number, boolean state) {
        if (number >= 0 && number <= 3) {
            checked[number] = state;
        }
    }

    void resetChecked() {
        Arrays.fill(checked, false);
    }

    public Boolean isChecked(int number) {
        return checked[number];
    }


    public Boolean[] getUserAnswers() {
        return checked;
    }

    public Boolean[] getAllCorrectAnswers() {
        return correctAnswer;
    }

    public String[] getAllChooses() {
        return mListOfchoose;
    }

    public String getQuestionText() {
        return question;
    }
}