package com.example.mycode;

public class quiz2QuestionLibrary {

    //Create array of questions
    private final String[] mQuestions = {
            "What letter is this:\n -.-.",
            "What letter is this:\n -..-",
            "What letter is this:\n ....",
            "What letter is this:\n .--.",
            "What letter is this:\n --",
            "What letter is this:\n ...-",
            "What letter is this:\n ---",
            "What letter is this:\n --.",
            "What letter is this:\n -.",
            "What letter is this:\n --..",
            "What letter is this:\n ..-",
            "What letter is this:\n ...",
            "What letter is this:\n --.-",
            "What letter is this:\n ..",
            "What letter is this:\n .---",
            "What letter is this:\n -",
            "What letter is this:\n -.-",
            "What letter is this:\n ..-.",
            "What letter is this:\n .--",
            "What letter is this:\n .-",
            "What letter is this:\n .-..",
            "What letter is this:\n -...",
            "What letter is this:\n -.--",
            "What letter is this:\n .-.",
            "What letter is this:\n -..",
            "What letter is this:\n .",
            "What letter is this:\n ."
            //Duplicate of last question, needed to make score appear
    };

    //Create array of choices
    private final String[][] mChoices = {
            {"L", "G", "J", "C"},
            {"F", "H", "X", "I"},
            {"H", "Z", "E", "W"},
            {"N", "O", "P", "E"},
            {"A", "M", "L", "N"},
            {"Y", "V", "I", "T"},
            {"O", "N", "P", "B"},
            {"E", "G", "Y", "A"},
            {"N", "L", "O", "Q"},
            {"I", "Z", "N", "M"},
            {"U", "S", "R", "F"},
            {"K", "E", "S", "J"},
            {"D", "X", "Q", "H"},
            {"I", "C", "B", "L"},
            {"P", "K", "J", "U"},
            {"T", "S", "C", "M"},
            {"C", "O", "X", "K"},
            {"Y", "I", "F", "G"},
            {"P", "W", "I", "Q"},
            {"I", "Z", "A", "G"},
            {"L", "I", "Z", "B"},
            {"F", "B", "G", "E"},
            {"X", "Y", "E", "W"},
            {"T", "L", "D", "R"},
            {"V", "Z", "O", "D"},
            {"Y", "L", "V", "E"},
            {"Y", "L", "V", "E"}
            //Duplicate of last question, needed to make score appear
    };

    //Create array of correct answers
    private final String[] mCorrectAnswers = {"C", "X", "H", "P", "M", "V", "O", "G", "N", "Z",
                                                "U", "S", "Q", "I", "J", "T", "K", "F", "W", "A",
                                                "L", "B", "Y", "R", "D", "E", "E"};
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