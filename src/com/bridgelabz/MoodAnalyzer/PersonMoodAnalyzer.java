package com.bridgelabz.MoodAnalyzer;
class MoodAnalysisException extends Exception{   //custom exception created by us which extends exception class
    MoodAnalysisException(String msg){  //constructor
        super(msg);
    }

}


public class PersonMoodAnalyzer {

    private  String msg;

    public PersonMoodAnalyzer(){  //empty or default constructor
        this.msg=" ";
    }
 public PersonMoodAnalyzer(String msg){ //constructor with parameters
        this.msg=msg;
 }


    public String analyzeMood() {       // Method to find mood of the person
       try{                              //try block for null message
        if(msg==null||msg.isEmpty()){
            throw new MoodAnalysisException ("Mood message cannot be null");
        }
        if(msg.contains("happy")){   //if message contains the word "happy" ,method returns "HAPPY"
            return "SAD";
        }
       else{
           return "HAPPY";
        }

       }
       catch (MoodAnalysisException e){     //catches the exception to throw an error message in case of null input
           System.out.println("Error : "+e.getMessage());
           return "Null";
       }

    }
}
