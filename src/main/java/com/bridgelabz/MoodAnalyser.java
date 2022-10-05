package com.bridgelabz;


    /*
    * UC2
    * Handle Exception if User Provides Invalid Mood - Like NULL
    */
public class MoodAnalyser {

                    String message;

                    public MoodAnalyser(){}

                    public MoodAnalyser(String message){
                        this.message = message;

                    }

                    public String analyseMood(){
                        try{
                            if(this.message.contains("sad"))
                            {
                                return "sad";
                            }
                            else {
                                return "happy";
                            }
                        }
                        catch(NullPointerException e)
                        {
                                return "happy";
                        }


                    }


}
