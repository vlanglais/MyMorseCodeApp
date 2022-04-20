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
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class Translator_T2C extends AppCompatActivity {

    private Switch switch1;

    private EditText inputText;
    private TextView outputText;

    private Button btnCheatSheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translator_t2c);

        //Actionbar
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Translator: Text to Code");
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Assign appearance - connect to xml counterparts
        inputText= findViewById(R.id.inputText);
        outputText= findViewById(R.id.outputText);
        btnCheatSheet= findViewById(R.id.btnCS);

        //Create string arrays for storing letter, numbers, and punctuation
        final String [] Text = new String[45];
        //Create string arrays for storing Morse Code
        final String[] MorseCode = new String[45];

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
        MorseCode[0] = ".-";
        MorseCode[1] = "-...";
        MorseCode[2] = "-.-.";
        MorseCode[3] = "-..";
        MorseCode[4] = ".";
        MorseCode[5] = "..-.";
        MorseCode[6] = "--.";
        MorseCode[7] = "....";
        MorseCode[8] = "..";
        MorseCode[9] = ".---";
        MorseCode[10] = "-.-";
        MorseCode[11] = ".-..";
        MorseCode[12] = "--";
        MorseCode[13] = "-.";
        MorseCode[14] = "---";
        MorseCode[15] = ".--.";
        MorseCode[16] = "--.-";
        MorseCode[17] = ".-.";
        MorseCode[18] = "...";
        MorseCode[19] = "-";
        MorseCode[20] = "..-";
        MorseCode[21] = "...-";
        MorseCode[22] = ".--";
        MorseCode[23] = "-..-";
        MorseCode[24] = "-.--";
        MorseCode[25] = "--..";
        MorseCode[26] = "-----";
        MorseCode[27] = ".----";
        MorseCode[28] = "..---";
        MorseCode[29] = "...--";
        MorseCode[30] = "....-";
        MorseCode[31] = ".....";
        MorseCode[32] = "-....";
        MorseCode[33] = "--...";
        MorseCode[34] = "---..";
        MorseCode[35] = "----.";
        MorseCode[36] = ".-.-.-";
        MorseCode[37] = "..-..";
        MorseCode[38] = "..--..";
        MorseCode[39] = "-.-.--";
        MorseCode[40] = ".----.";
        MorseCode[41] = "-.-.-.";
        MorseCode[42] = "---...";
        MorseCode[43] = "-....-";
        MorseCode[44] = "/";

        //Switch control
        switch1=findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    openCodeToText();
                }
            }
        });

        //Translate code to text and output in realtime
        inputText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {   //Convert the Text to String
                String realTime = inputText.getText().toString();
                String output = "";
                int l = realTime.length();
                int i, j;
                for (i = 0; i < l; i++) {
                    String ch = realTime.substring(i, i + 1);
                    for (j = 0; j < 45; j++) {
                        if (ch.equalsIgnoreCase(Text[j])) {
                            output = output.concat(MorseCode[j].concat(" "));
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

        //Start of Button Listener for btnCheatSheet (cheat sheet button)
        btnCheatSheet = findViewById(R.id.btnCS);
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

    //Switch Control - opens Code to Text Translator
    public void openCodeToText(){
        Intent CodeToText = new Intent(Translator_T2C.this, Translator_C2T.class);
        startActivity(CodeToText);
    }

    //btnCheatSheet control - opens pop up cheat sheet
    public void openPopUp(){
        Intent PopUp = new Intent(Translator_T2C.this, pop.class);
        startActivity(PopUp);
    }
}