package model.Action;

import model.Model;

public class ChangeDoor implements IAction {

	// This method change the Mortal door to the ending door
	public ChangeDoor() {
		Model model = new Model();
		model.updateSprite(20, 20, "s", "no recover");
	}

	public void Action(String Object, String type) {
		// TODO Auto-generated method stub

	}

}
