package com.example.mycode;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button Translator;
    private Button Learn;
    private Button Quizzes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Actionbar
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("My Morse Code App");
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Translator button
        Translator = findViewById(R.id.Translator);
        Translator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTranslator();
            }
        });

        //Learn Morse Code button
        Learn = findViewById(R.id.Learn);
        Learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLearn();
            }
        });

        //Quizzes button
        Quizzes = findViewById(R.id.Quizzes);
        Quizzes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizzes();
            }
        });
    }

    //Back Button Navigation Control
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent returnHome = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(returnHome);
        return true;
    }

    //Open Translator
    public void openTranslator(){
        Intent intent1 = new Intent(MainActivity.this, Translator_T2C.class);
        startActivity(intent1);
    }

    //Open Learn Morse Code
    public void openLearn(){
        Intent intent2 = new Intent(MainActivity.this, LearnCode.class);
        startActivity(intent2);
    }

    //Open Quizzes
    public void openQuizzes(){
        Intent intent3 = new Intent(MainActivity.this, Quizzes.class);
        startActivity(intent3);
    }
}