package org.example;

public class MoodAnalyser {
    public String analyseMood(String mood){
        if(mood.contains("Happy")){
            return "Happy";
        }else{
            return "SAD";
        }
    }
}
