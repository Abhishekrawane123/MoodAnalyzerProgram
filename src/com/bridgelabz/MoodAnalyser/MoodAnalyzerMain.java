package com.bridgelabz.MoodAnalyser;

import java.util.Scanner;

public class MoodAnalyzerMain {

	public static void main(String[] args) throws MoodAnalysisException {

//		System.out.println("How was your mood?");
//		Scanner sc = new Scanner(System.in);
//		String message = sc.nextLine();
		
		MoodAnalyzer mood = MoodAnalyzer.getInstance(" ");
		System.out.println(mood.analyseMood());
		}
}