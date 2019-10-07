package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	private String[][] wordBank = new String[10][];
	
	public Logic(PApplet app) {
		this.app = app;
		for (int i = 0; i < 10; i++) {
			wordBank[i] = app.loadStrings((2+i)+"letterWords.txt");
		}
	}
	
	public String calculateValue(String wordInput) {
		String word = wordInput.toLowerCase();
		if(word.length() > 1 && word.length() <= 12) {
			for(int i = 0; i < wordBank[word.length()-2].length; i++) {
				if(word.equals(wordBank[word.length()-2][i])) {
					System.out.println("Es valida");
					int points = 0;
					for(int j = 0; j < word.length(); j++) {
						if(word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u' ||
						word.charAt(j) == 'l' || word.charAt(j) == 'n' || word.charAt(j) == 'r' || word.charAt(j) == 's' || word.charAt(j) == 't' ) {
							points++;
						} else if(word.charAt(j) == 'd' || word.charAt(j) == 'g') {
							points += 2;
						} else if(word.charAt(j) == 'b' || word.charAt(j) == 'c' || word.charAt(j) == 'm' || word.charAt(j) == 'p') {
							points += 3;
						} else if(word.charAt(j) == 'f' || word.charAt(j) == 'h' || word.charAt(j) == 'v' || word.charAt(j) == 'w' || word.charAt(j) == 'y') {
							points += 4;
						} else if(word.charAt(j) == 'k') {
							points += 5;
						} else if(word.charAt(j) == 'j' || word.charAt(j) == 'x') {
							points += 8;
						} else if(word.charAt(j) == 'q' || word.charAt(j) == 'z') {
							points += 10;
						}
					}
					System.out.println("Puntos: "+points);
					return points+" points";
				}
			}
			return "Not a valid word";
		} else {
			return "Not a valid word";
		}
		
	}
}
