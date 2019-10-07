package view;

import model.Logic;
import processing.core.PApplet;
import processing.core.PFont;

public class Main extends PApplet {

	private Logic log;
	private PFont fontBig, fontSmall;
	private StringBuffer word;
	
	public static void main(String[] args) {
		PApplet.main("view.Main");
	}
	
	public void settings() {
		size(700, 700);
	}
	
	public void setup() {
		background(219, 33, 33);
		textAlign(CENTER);
		fontBig = createFont("RobotoSlab-Bold.ttf", 32);
		textFont(fontBig);
		text("Loading", width/2, height/2);
		rectMode(CENTER);
		noStroke();
		fontSmall = createFont("RobotoSlab-Bold.ttf", 18);
		log = new Logic(this);
		word = new StringBuffer();
	}
	
	public void draw() {
		background(219, 33, 33);
		fill(255);
		textFont(fontBig);
		text("Type a word", width/2, 200);
		text(word.toString(), width/2, height/2);
		rect(width/2, height/2+195, 200, 50, 25);
		fill(219, 33, 33);
		textFont(fontSmall);
		text("Click to get value", width/2, height/2+200);
	}
	
	public void keyPressed() {
		if(keyCode == BACKSPACE) {
			if(word.length() > 0) {
				word.deleteCharAt(word.length()-1);
			}
		} else {
			word.append(key);
		}
	}

}
