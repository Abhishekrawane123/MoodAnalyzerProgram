package com.bridgelabz.MoodAnalyser;

import java.util.Scanner;

public class MoodAnalyzerMain {

	public static void main(String[] args) {
		
		System.out.println("Your Mood Be Like....");
		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();
		MoodAnalyzer mood = MoodAnalyzer.getInstance(message);
		System.out.println(mood.analyseMood());
	}
}