package com.example.mycode;

public class quiz6QuestionLibrary {

    //Create array of questions
    private final String[] mQuestions = {
            "What number is this:\n -----",
            "What number is this:\n ....-",
            "What number is this:\n .----",
            "What number is this:\n ---..",
            "What number is this:\n ...--",
            "What number is this:\n --...",
            "What number is this:\n -....",
            "What number is this:\n ----.",
            "What number is this:\n .....",
            "What number is this:\n ..---",
            "What number is this:\n ..---"
            //Duplicate of last question, needed to make score appear
    };

    //Create array of choices

    private final String[][] mChoices = {
            {"0", "4", "7", "5"},
            {"5", "2", "3", "4"},
            {"4", "1", "7", "6"},
            {"3", "0", "8", "2"},
            {"7", "1", "6", "3"},
            {"9", "5", "7", "8"},
            {"2", "1", "8", "6"},
            {"1", "9", "3", "4"},
            {"2", "5", "0", "4"},
            {"5", "6", "2", "4"},
            {"5", "6", "2", "4"}
            //Duplicate of last question, needed to make score appear
    };

    //Create array of correct answers
    private final String[] mCorrectAnswers = {"0", "4", "1", "8", "3", "7", "6", "9", "5", "2", "2"};
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