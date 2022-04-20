package com.example.mycode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class Translator_C2T extends AppCompatActivity {

    private Switch switch1;

    private TextView inputText;
    private TextView outputText;

    private Button btnSpace;
    private Button btnDot;
    private Button btnDash;
    private Button btnNewWord;
    private Button btnBack;
    private Button btnCheatSheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translator_c2t);

        //Actionbar
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Translator: Code to Text");
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Assign appearance - connect to xml counterparts
        inputText= findViewById(R.id.inputText);
        outputText= findViewById(R.id.outputText);
        btnSpace= findViewById(R.id.btnSpace);
        btnDot= findViewById(R.id.btnDot);
        btnDash= findViewById(R.id.btnDash);
        btnNewWord= findViewById(R.id.btnNewWord);
        btnBack= findViewById(R.id.btnBack);
        btnCheatSheet= findViewById(R.id.btnCS);


        //Create string arrays for storing letter, numbers, and punctuation
        final String [] Text = new String[45];
        //Create string arrays for storing Morse Code
        final String[] Code = new String[45];

        //Assign letters/number/punctuation
        Text[0] = "A";
        Text[1] = "B";
        Text[2] = "C";
        Text[3] = "D";
        Text[4] = "E";
        Text[5] = "F";
        Text[6] = "G";
        Text[7] = "H";
        Text[8] = "I";
        Text[9] = "J";
        Text[10] = "K";
        Text[11] = "L";
        Text[12] = "M";
        Text[13] = "N";
        Text[14] = "O";
        Text[15] = "P";
        Text[16] = "Q";
        Text[17] = "R";
        Text[18] = "S";
        Text[19] = "T";
        Text[20] = "U";
        Text[21] = "V";
        Text[22] = "W";
        Text[23] = "X";
        Text[24] = "Y";
        Text[25] = "Z";
        Text[26] = "0";
        Text[27] = "1";
        Text[28] = "2";
        Text[29] = "3";
        Text[30] = "4";
        Text[31] = "5";
        Text[32] = "6";
        Text[33] = "7";
        Text[34] = "8";
        Text[35] = "9";
        Text[36] = ".";
        Text[37] = ",";
        Text[38] = "?";
        Text[39] = "!";
        Text[40] = "'";
        Text[41] = ";";
        Text[42] = ":";
        Text[43] = "-";
        Text[44] = " ";

        //Assign Morse Code
        Code[0] = ".-";
        Code[1] = "-...";
        Code[2] = "-.-.";
        Code[3] = "-..";
        Code[4] = ".";
        Code[5] = "..-.";
        Code[6] = "--.";
        Code[7] = "....";
        Code[8] = "..";
        Code[9] = ".---";
        Code[10] = "-.-";
        Code[11] = ".-..";
        Code[12] = "--";
        Code[13] = "-.";
        Code[14] = "---";
        Code[15] = ".--.";
        Code[16] = "--.-";
        Code[17] = ".-.";
        Code[18] = "...";
        Code[19] = "-";
        Code[20] = "..-";
        Code[21] = "...-";
        Code[22] = ".--";
        Code[23] = "-..-";
        Code[24] = "-.--";
        Code[25] = "--..";
        Code[26] = "-----";
        Code[27] = ".----";
        Code[28] = "..---";
        Code[29] = "...--";
        Code[30] = "....-";
        Code[31] = ".....";
        Code[32] = "-....";
        Code[33] = "--...";
        Code[34] = "---..";
        Code[35] = "----.";
        Code[36] = ".-.-.-";
        Code[37] = "..-..";
        Code[38] = "..--..";
        Code[39] = "-.-.--";
        Code[40] = ".----.";
        Code[41] = "-.-.-.";
        Code[42] = "---...";
        Code[43] = "-....-";
        Code[44] = "/";

        //Switch control
        switch1=findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked){
                    openTextToCode();
                }
            }
        });

        //Translate text to code and output in realtime
        inputText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {   //Convert the Text to String
                String realTime1 = inputText.getText().toString();
                    String realTime = realTime1.concat(" ");
                    int l = realTime.length();
                    int i, j, p;
                    int pos = 0;
                    String letter = "";
                    String output = "";
                    for(i = 0; i < l; i++) {
                        int flag = 0;
                        String ch = realTime.substring(i, i + 1);
                        if (ch.equalsIgnoreCase(" ")){
                            p = i;
                            letter = realTime.substring(pos, p);
                            pos = p + 1;
                            flag = 1;
                        }
                        String letter1 = letter.trim();
                        if(flag == 1){
                            for (j = 0; j <= 44; j++) {
                                if(letter1.equalsIgnoreCase(Code[j])){
                                    output = output.concat(Text[j]);
                                    break;
                                }
                            }
                        }
                    }
                    outputText.setText(output);
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
            }
        });


        //Start of Button Listener for btnSpace (space button)
        btnSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText().toString() + " ");
            }
        });
        //End of Button Listener for btnSpace (space button)

        //Start of Button Listener for btnDot (dot button)
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText().toString() + ".");
            }
        });
        //End of Button Listener for btnDot (dot button)

        //Start of Button Listener for btnDash (dash button)
        btnDash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText().toString() +"-");
            }
        });
        //End of Button Listener for btnDash (dash button)

        //Start of Button Listener for btnNewWord (new word button)
        btnNewWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText().toString() +" / ");
            }
        });
        //End of Button Listener for btnNewWord (new word button)

        //Start of Button Listener for btnBack (back button)
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputText.getText().length() > 0) {
                    CharSequence name = inputText.getText().toString();
                    inputText.setText(name.subSequence(0, name.length() - 1));
                }
                else{
                    inputText.setText(null);
                    outputText.setText(null);
                }
            }
        });
        //End of Button Listener for btnBack (back button)

        //Start of Button Listener for btnCheatSheet (cheat sheet button)
        btnCheatSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPopUp();
            }
        });
        //End of Button Listener for btnCheatSheet (cheat sheet button)
    }

    //Actionbar Back Button Navigation Control
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent returnHome = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(returnHome);
        return true;
    }

    //Switch Control - opens Text to Code Translator
    public void openTextToCode(){
        Intent TextToCode = new Intent(Translator_C2T.this, Translator_T2C.class);
        startActivity(TextToCode);
    }

    //btnCheatSheet control - opens pop up cheat sheet
    public void openPopUp(){
        Intent PopUp = new Intent(Translator_C2T.this, pop.class);
        startActivity(PopUp);
    }
}