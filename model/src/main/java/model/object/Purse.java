package model.object;

import model.Action.Action;

public class Purse {

	public Purse(int x, int y, String type) {
		Action action = new Action(ObjectComportement.POINTS, ObjectComportement.PENETRABLE, ObjectComportement.NONE, type, x, y);
	}

}
