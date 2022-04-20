package com.example.mycode;

public class quiz4QuestionLibrary {

    //Create array of questions
    private final String[] mQuestions = {
            "What punctuation is this:\n .-.-.-",
            "What punctuation is this:\n ---...",
            "What punctuation is this:\n .----.",
            "What punctuation is this:\n -....-",
            "What punctuation is this:\n ..--..",
            "What punctuation is this:\n -.-.-.",
            "What punctuation is this:\n -.-.--",
            "What punctuation is this:\n ..-..",
            "What punctuation is this:\n ..-..",
            "What punctuation is this:\n ..-.."
            //Duplicate of last question, needed to make score appear
    };

    //Create array of choices
    private final String[][] mChoices = {
            {"?", ".", ";", "!"},
            {":", "'", ".", ","},
            {",", "?", "'", "!"},
            {";", ".", "!", "-"},
            {".", "?", "'", "-"},
            {".", "!", ";", ":"},
            {"!", ".", "-", ","},
            {"!", "-", ",", "?"},
            {"!", "-", ",", "?"},
            {"!", "-", ",", "?"}
            //Duplicate of last question, needed to make score appear
    };

    //Create array of correct answers
    private final String[] mCorrectAnswers = {".", ":", "'", "-", "?", ";", "!", ",", ",", ","};
                                        //Duplicate of last question, needed to make score appear

    //Get question from question array
    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    //Get choice1 from choices array
    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    //Get choice2 from choices array
    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    //Get choice3 from choices array
    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    //Get choice4 from choices array
    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    //Get correct answer from answers array
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}