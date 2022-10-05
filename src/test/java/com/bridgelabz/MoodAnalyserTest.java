package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

   @Test
    public void checking_Mood_Analyser_Returns_Sad(){
        String message = "I am in sad mood ";
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        Assert.assertEquals("sad",moodAnalyser.analyseMood());
    }
    @Test
    public void checking_Mood_Analyser_Returns_Happy(){
       String message = "I am Normal mood";
       MoodAnalyser moodAnalyser = new MoodAnalyser(message);
       Assert.assertEquals("happy",moodAnalyser.analyseMood());
    }
    @Test
    public void checking_Mood_Analyser_Null_Pointer_Exception(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        Assert.assertEquals("happy",moodAnalyser.analyseMood());


    }
}
