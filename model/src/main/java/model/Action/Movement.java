package model.Action;

import model.Model;
import model.Mobile.*;

public class Movement implements IAction{
	//This method authorize the movement of the character
	public Movement(int x, int y, String type) {
		Model model = new Model();
		model.updateSprite(x, y, type);
	}

	public void Action(String Object, String type) {
		// TODO Auto-generated method stub
		
	}

}
