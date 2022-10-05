package com.bridgelabz;


/*
Given a Message, ability
to analyse and respond
Happy or Sad Mood - Create MoodAnalyser Object - Call analyseMood function with message as
parameter and return Happy or Sad Mood
 */
public class MoodAnalyser {

                    String message;

                    public MoodAnalyser(){}

                    public MoodAnalyser(String message){
                        this.message = message;

                    }

                    public String analyseMood(){
                        if(this.message.contains("sad"))
                        {
                            return "sad";
                        }
                        else {
                            return "happy";
                        }

                    }


}
