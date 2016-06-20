package model.Mobile;

import model.Model;
import model.Action.Movement;
import model.object.*;

public class Mobile {
	int x;
	int y;
	/*
	 * Mobile collect the new positions of x and y and then send it to Element
	 */
	public Mobile(int x, int y, String type) {
		this.x=x;
		this.y=y;
		Model model = new Model();
		model.loadSprite(x, y, type);
		model.loadNewMap();
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
