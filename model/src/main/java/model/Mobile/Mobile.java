package model.Mobile;

import model.Action.Movement;
import model.object.*;

public class Mobile {
	int x;
	int y;
	/*
	 * Mobile collect the new positions of x and y and then send it to Element
	 */
	public Mobile(int x, int y, String type) {
		//SerpentDoor knee = new SerpentDoor(x, y, type);
		//Movement move = new Movement("Lorann", x, y);
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
