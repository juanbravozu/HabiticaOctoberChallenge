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
}
