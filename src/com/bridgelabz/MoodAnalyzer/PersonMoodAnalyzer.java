package com.bridgelabz.MoodAnalyzer;

public class PersonMoodAnalyzer {

    private  String msg;

    public PersonMoodAnalyzer(){ //empty or default constructor
        this.msg=" ";
    }
 public PersonMoodAnalyzer(String msg){ //constructor with parameters
        this.msg=msg;
 }
    public String analyzeMood(){       // Method to find mood of the person
       try{                              //try block for null message
        if(msg==null||msg.isEmpty()){
            throw new NullPointerException ("Invalid mood message ");
        }
        if(msg.contains("happy")){   //if message contains the word "happy" ,method returns "HAPPY"
            return "SAD";
        }
       else{
           return "HAPPY";
        }

       }
       catch (NullPointerException e){     //catches the exception to print the ouput  "invalid mood"
           System.out.println("Error : "+e.getMessage());
           return "Invalid Mood!";
       }

    }
}
