package view;

import model.Logic;
import processing.core.PApplet;
import processing.core.PFont;

public class Main extends PApplet {

	private Logic log;
	private PFont fontBig, fontSmall;
	private StringBuffer word;
	private String points;
	
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
		points = "";
	}
	
	public void draw() {
		background(219, 33, 33);
		fill(255);
		textFont(fontBig);
		text("Type a word", width/2, 200);
		text(word.toString(), width/2, height/2-50);
		text(points, width/2, height/2+50);
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
		} else if((key <= 122 && key >= 97) || (key >= 65 && key <= 90)){
			word.append(key);
			System.out.println((int)key);
		}
	}

	public void mousePressed() {
		if(mouseX > width/2-100 && mouseX < width/2+100 &&
		mouseY > height/2+95 && mouseY < height/2+295) {
			points = log.calculateValue(word.toString());
			System.out.println("area sensible");
		}
	}
}
