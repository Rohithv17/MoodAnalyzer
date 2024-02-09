package com.bridgelabz.MoodAnalyzer;

public class PersonMoodAnalyzer {

    private  String msg;

    public PersonMoodAnalyzer(String msg){
        this.msg=msg;

    }

    public String analyzeMood(){  // Method to find mood of the person

        if(msg.contains("sad")){
            return "SAD";
        }
        else {
            return "Invalid Mood";
        }

    }
}
