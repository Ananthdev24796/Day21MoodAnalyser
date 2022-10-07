    package com.bridgelabz;


        /*
        * UC3
        *Inform user if entered Invalid Mood  In case of NULL or Empty Mood throw
        *Custom Exception MoodAnalysisException
        * Use Enum to differentiate the Mood Analysis Errors
        */
    public class MoodAnalyser {
            String message;

            public MoodAnalyser(){}

            public MoodAnalyser(String message){
                this.message = message;

            }
            public void validMesssage(String message)throws MoodAnalyserException{
                if(message == null){
                    throw new MoodAnalyserException("Please Enter Message");
                }

            }
            public String analyseMood() {
                try {
                    validMesssage(message);
                }
                catch (MoodAnalyserException e) {
                    System.out.println(e);
                }
                if ( this.message!= null && this.message.contains("sad")) {
                    return "sad";
                } else {
                    return "happy";
                }
            }
        }





