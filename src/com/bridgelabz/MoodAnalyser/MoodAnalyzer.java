package com.bridgelabz.MoodAnalyser;

public class MoodAnalyzer
{
	public static MoodAnalyzer instance;
   
	private String message;
    
    public MoodAnalyzer(String message) 
    {
        this.message = message;
    }
    
    public static MoodAnalyzer getInstance(String userMessage) {
		if (instance == null) {
			instance = new MoodAnalyzer(userMessage);
		}
		return instance;
	}

    public String analyseMood()
    {
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}