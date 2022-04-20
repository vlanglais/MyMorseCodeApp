package com.example.mycode;

public class quiz1QuestionLibrary {

    //Create array of questions
    private final String[] mQuestions = {
            "What letter is this:\n K",
            "What letter is this:\n N",
            "What letter is this:\n R",
            "What letter is this:\n L",
            "What letter is this:\n A",
            "What letter is this:\n U",
            "What letter is this:\n B",
            "What letter is this:\n D",
            "What letter is this:\n F",
            "What letter is this:\n V",
            "What letter is this:\n W",
            "What letter is this:\n H",
            "What letter is this:\n C",
            "What letter is this:\n Y",
            "What letter is this:\n P",
            "What letter is this:\n Q",
            "What letter is this:\n G",
            "What letter is this:\n E",
            "What letter is this:\n X",
            "What letter is this:\n Z",
            "What letter is this:\n M",
            "What letter is this:\n J",
            "What letter is this:\n O",
            "What letter is this:\n S",
            "What letter is this:\n I",
            "What letter is this:\n T",
            "What letter is this:\n T"
            //Duplicate of last question, needed to make score appear
    };

    //Create array of choices
    private final String[][] mChoices = {
            {"-.-.", "..", "-.-", "..-"},
            {"-.", "-..-", "-...", "--."},
            {"--..", "...", ".-.", "...-"},
            {"-..-", "..", ".-..", ".---"},
            {"..-", ".-", ".--.", "--.-"},
            {"--.-", "..-", "-...", "-.-"},
            {"-..-", "-...", "--.", "---"},
            {"-...", "-..", "---", "...-"},
            {"-.-", "..", "..-.", "--.-"},
            {"--", "...-", "-...", ".-."},
            {"--..", "..-.", ".--", "...-"},
            {"....", ".-..", ".-", "-."},
            {".---", "-.", "-.-.", "-..."},
            {"-", "-.--", "-...", "--"},
            {".-..", ".--.", "-..", ".---"},
            {"-.--", ".-..", ".-", "--.-"},
            {"-.--", ".", "--.", "..-"},
            {"...-", "--", ".", ".-"},
            {"...-", "--.", "-..-", "-.--"},
            {"--..", "--.", "-.", "--.-"},
            {"-...", "..-", "....", "--"},
            {".---", ".-", "...-", "--."},
            {"---", "...-", "-...", "-.--"},
            {"-.-", "...", "-.-.", ".-"},
            {".-.", "..-.", "-.--", ".."},
            {"-", ".-..", ".", "--"},
            {"-", ".-..", ".", "--"}
            //Duplicate of last question, needed to make score appear
    };

    //Create array of correct answers
    private final String[] mCorrectAnswers = {"-.-", "-.", ".-.", ".-..", ".-", "..-", "-...",
                                                "-..", "..-.", "...-", ".--", "....", "-.-.",
                                                "-.--", ".--.", "--.-", "--.", ".", "-..-",
                                                "--..", "--", ".---", "---", "...", "..",
                                                "-", "-"};
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