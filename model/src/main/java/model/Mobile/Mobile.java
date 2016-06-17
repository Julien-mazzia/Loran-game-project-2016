package model.Mobile;

import model.Action.Movement;
import model.object.Kneecap;

public class Mobile {
	int x;
	int y;
	/*
	 * Mobile collect the new positions of x and y and then send it to Element
	 */
	public Mobile(int x, int y, String type) {
		//Kneecap knee = new Kneecap(x, y, type);
		Movement move = new Movement("Lorann");
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Mobile(){
		
	}
}
