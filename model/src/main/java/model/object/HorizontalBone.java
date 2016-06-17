package model.object;

import model.Action.Action;

public class HorizontalBone {

	public HorizontalBone(int x, int y, String type) {
		Action action = new Action(ObjectComportement.BLOCKING, ObjectComportement.NONE, ObjectComportement.NONE, type);
	}

}
