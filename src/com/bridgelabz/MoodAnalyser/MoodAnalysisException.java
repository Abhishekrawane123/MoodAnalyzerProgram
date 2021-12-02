package com.bridgelabz.MoodAnalyser;

public class MoodAnalysisException extends Exception{
	Mood mood;
	enum Mood {NULL_MOOD,EMPTY_MOOD}
	
	MoodAnalysisException(Mood mood , String message){
		super(message);
		this.mood=mood;
	}
}