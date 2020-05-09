package com.example.learnkorean;

public class Character {

    private int id;
    private String korean;
    private String english;

    public Character(int iId, String iKorean, String iEnglish) {
        id = iId;
        korean = iKorean;
        english = iEnglish;
    }

    public Character(String iKorean, String iEnglish) {
        id = -1;
        korean = iKorean;
        english = iEnglish;
    }

    public int getId() {
        return id;
    }

    public String getKorean() {
        return korean;
    }

    public String getEnglish() {
        return english;
    }

}
