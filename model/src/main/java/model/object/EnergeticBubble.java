package model.object;

import model.Action.Action;

public class EnergeticBubble {

	public EnergeticBubble(int x, int y, String type) {
		Action action = new Action(ObjectComportement.LINKED, ObjectComportement.PENETRABLE, ObjectComportement.NONE, type);
	}

}
