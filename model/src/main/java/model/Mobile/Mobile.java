package model.Mobile;

import model.object.Kneecap;

public class Mobile {

	/*
	 * Mobile collect the new positions of x and y and then send it to Element
	 */
	public Mobile(int x, int y, String type) {
		Kneecap knee = new Kneecap(x, y, type);
	}
}
