package com.bridgelabz.MoodAnalyzer;

public class PersonMoodAnalyzer {

    private  String msg;

    public PersonMoodAnalyzer(String msg){
        this.msg=msg;

    }

    public String analyzeMood(){  // Method to find mood of the person

        if(msg.contains("sad")){   //if message contains the word "sad" ,returns "SAD" ,any other message  returns "HAPPY"
            return "SAD";
        }
        else {
            return "HAPPY";
        }

    }
}
