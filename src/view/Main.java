package view;

import model.Logic;
import processing.core.PApplet;

public class Main extends PApplet {

	private Logic log;
	
	public static void main(String[] args) {
		PApplet.main("view.Main");
	}
	
	public void settings() {
		size(700, 700);
	}
	
	public void setup() {
		background(219, 33, 33);
		textAlign(CENTER);
		textFont(createFont("RobotoSlab-Bold.ttf", 32));
		text("Loading", width/2, height/2);
		log = new Logic(this);
	}
	
	public void draw() {
		
	}
	
	public void keyPressed() {
		
	}

}
