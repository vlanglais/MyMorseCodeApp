package com.example.mycode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Quizzes extends AppCompatActivity {

    private Button btnQuiz1;
    private Button btnQuiz2;
    private Button btnQuiz3;
    private Button btnQuiz4;
    private Button btnQuiz5;
    private Button btnQuiz6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzes);

        //Actionbar
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Quizzes");
        actionBar.setDisplayHomeAsUpEnabled(true);


        //Quiz 1 button
        btnQuiz1 = findViewById(R.id.btnQuiz1);
        btnQuiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuiz1();
            }
        });

        //Quiz 2 button
        btnQuiz2 = findViewById(R.id.btnQuiz2);
        btnQuiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuiz2();
            }
        });

        //Quiz 3 button
        btnQuiz3 = findViewById(R.id.btnQuiz3);
        btnQuiz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuiz3();
            }
        });

        //Quiz 4 button
        btnQuiz4 = findViewById(R.id.btnQuiz4);
        btnQuiz4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuiz4();
            }
        });

        //Quiz 5 button
        btnQuiz5 = findViewById(R.id.btnQuiz5);
        btnQuiz5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuiz5();
            }
        });

        //Quiz 6 button
        btnQuiz6 = findViewById(R.id.btnQuiz6);
        btnQuiz6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuiz6();
            }
        });
    }

    //Back Button Navigation Control
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent returnHome = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(returnHome);
        return true;
    }

    //Open Quiz 1
    public void openQuiz1() {
        Intent openQuiz1 = new Intent(Quizzes.this, quiz1.class);
        startActivity(openQuiz1);
    }

    //Open Quiz 2
    public void openQuiz2() {
        Intent openQuiz2 = new Intent(Quizzes.this, quiz2.class);
        startActivity(openQuiz2);
    }

    //Open Quiz 3
    public void openQuiz3() {
        Intent openQuiz3 = new Intent(Quizzes.this, quiz3.class);
        startActivity(openQuiz3);
    }

    //Open Quiz 4
    public void openQuiz4() {
        Intent openQuiz4 = new Intent(Quizzes.this, quiz4.class);
        startActivity(openQuiz4);
    }

    //Open Quiz 5
    public void openQuiz5() {
        Intent openQuiz5 = new Intent(Quizzes.this, quiz5.class);
        startActivity(openQuiz5);
    }

    //Open Quiz 6
    public void openQuiz6() {
        Intent openQuiz6 = new Intent(Quizzes.this, quiz6.class);
        startActivity(openQuiz6);
    }
}