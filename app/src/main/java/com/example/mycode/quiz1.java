package com.example.mycode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class quiz1 extends AppCompatActivity {

    private final quiz1QuestionLibrary mQuestionLibrary = new quiz1QuestionLibrary();

    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mButtonNext;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;
    private int questionAttempted = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        //Actionbar
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Text to Code: Letters");
        actionBar.setDisplayHomeAsUpEnabled(true);

        mQuestionView = findViewById(R.id.question);
        mButtonChoice1 = findViewById(R.id.choice1);
        mButtonChoice2 = findViewById(R.id.choice2);
        mButtonChoice3 = findViewById(R.id.choice3);
        mButtonChoice4 = findViewById(R.id.choice4);
        mButtonNext = findViewById(R.id.next);

        updateQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    mButtonChoice1.setBackgroundColor(Color.GREEN);
                } else {
                    mButtonChoice1.setBackgroundColor(Color.RED);
                }
                lockButtons();
                mButtonNext.setVisibility(View.VISIBLE);
            }
        });
        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    mButtonChoice2.setBackgroundColor(Color.GREEN);
                } else {
                    mButtonChoice2.setBackgroundColor(Color.RED);
                }
                lockButtons();
                mButtonNext.setVisibility(View.VISIBLE);
            }
        });
        //End of Button Listener for Button2

        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    mButtonChoice3.setBackgroundColor(Color.GREEN);
                } else {
                    mButtonChoice3.setBackgroundColor(Color.RED);
                }
                lockButtons();
                mButtonNext.setVisibility(View.VISIBLE);
            }
        });
        //End of Button Listener for Button3

        //Start of Button Listener for Button4
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mButtonChoice4.getText() == mAnswer){
                    mScore = mScore + 1;
                    mButtonChoice4.setBackgroundColor(Color.GREEN);
                } else {
                    mButtonChoice4.setBackgroundColor(Color.RED);
                }
                lockButtons();
                mButtonNext.setVisibility(View.VISIBLE);
            }
        });
        //End of Button Listener for Button4

        mButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuestion();
                updateQuestionsAttempted();
                unlockButtons();
                mButtonNext.setVisibility(View.INVISIBLE);
            }
        });
    }

    //Back Button Navigation Control
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent returnQuizzes = new Intent(getApplicationContext(), Quizzes.class);
        startActivity(returnQuizzes);
        return true;
    }

    //Score appears at end of quiz
    private void showBottomSheet(){
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(quiz1.this);
        View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.score_bottom_sheet, findViewById(R.id.idLLScore));
        TextView scoreTV = bottomSheetView.findViewById(R.id.idTVScore);
        scoreTV.setText("Your score is \n"+ mScore + "/26");

        //Take another quiz button control
        Button newQuizBtn = bottomSheetView.findViewById(R.id.idBtnNewQuiz);
        newQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openQuizzes = new Intent(quiz1.this, Quizzes.class);
                startActivity(openQuizzes);
            }
        });
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    //When 26 questions attempted, score appears
    private void setDataViews() {
        if(questionAttempted == 26){
            showBottomSheet();
        }
    }

    //Update question and choices, reset colors
    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mButtonChoice1.setBackgroundColor(Color.parseColor("#D6D7D7"));
        mButtonChoice2.setBackgroundColor(Color.parseColor("#D6D7D7"));
        mButtonChoice3.setBackgroundColor(Color.parseColor("#D6D7D7"));
        mButtonChoice4.setBackgroundColor(Color.parseColor("#D6D7D7"));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
        setDataViews();
    }

    //Update question to determine when score appears
    private void updateQuestionsAttempted(){
        questionAttempted++;
    }

    //Lock buttons, only allows one answer per question
    private void lockButtons(){
        mButtonChoice1.setEnabled(false);
        mButtonChoice2.setEnabled(false);
        mButtonChoice3.setEnabled(false);
        mButtonChoice4.setEnabled(false);
    }

    //Unlock buttons when question and choices are updated
    private void unlockButtons(){
        mButtonChoice1.setEnabled(true);
        mButtonChoice2.setEnabled(true);
        mButtonChoice3.setEnabled(true);
        mButtonChoice4.setEnabled(true);
    }
}