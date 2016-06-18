package model.Action;

import model.Model;
import model.Mobile.*;

public class Movement implements IAction{
	//This method authorize the movement of the character
	public Movement(int x, int y, String type) {
		Model model = new Model();
		if(type =="Lorann"){
			model.updateSprite(x, y, "l");
		}else if(type=="Monster"){
			model.updateSprite(x, y, "m");
		}else if(type=="Spell"){
			model.updateSprite(x, y, "s");
		}
		
		
	}

	public void Action(String Object, String type) {
		// TODO Auto-generated method stub
		
	}

}
