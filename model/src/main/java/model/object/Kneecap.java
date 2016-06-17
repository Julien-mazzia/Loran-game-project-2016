package model.object;

import model.Action.Action;

public class Kneecap {

	public Kneecap(int x, int y, String type) {
		Action action = new Action(ObjectComportement.BLOCKING, ObjectComportement.NONE, ObjectComportement.NONE, type);
	}

}
