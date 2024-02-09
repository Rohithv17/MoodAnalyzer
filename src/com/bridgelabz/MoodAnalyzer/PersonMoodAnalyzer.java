package com.bridgelabz.MoodAnalyzer;

public class PersonMoodAnalyzer {

    private  String msg;

    public PersonMoodAnalyzer(){ //empty or default constructor
        this.msg=" ";
    }
 public PersonMoodAnalyzer(String msg){ //constructor with parameters
        this.msg=msg;
 }
    public String analyzeMood(){  // Method to find mood of the person

        if(msg.contains("happy")){   //if message contains the word "happy" ,method returns "SAD"
            return "SAD";
        }
       else{
           return "HAPPY";
        }
    }
}
