package com.example.mycode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class LearnCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        //Actionbar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Learn Morse Code");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    //Back Button Navigation Control
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent returnHome = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(returnHome);
        return true;
    }
}