package model.object;

import model.Action.Action;

public class EndingDoor {

	public EndingDoor(int x, int y, String type) {
		Action action = new Action(ObjectComportement.LEVELCHANGER, ObjectComportement.PENETRABLE, ObjectComportement.NONE, type);
	}

}
