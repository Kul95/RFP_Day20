package org.example;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class MoodAnalyserTest {
    public void testMoodAnalyser() throws Exception{
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood=moodAnalyser.analyseMood("This is a Happy message");
        Assert.assertThat(mood, CoreMatchers.is("Happy"));
    }
}
