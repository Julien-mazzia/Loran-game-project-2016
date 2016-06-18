package model.Action;

import model.Model;
import model.Mobile.*;

public class Movement implements IAction{
	//This method authorize the movement of the character
	public Movement(int x, int y, String type) {
		Model model = new Model();
		if(type =="Lorann"){
			model.updateSprite(x, y, "l");
		}else if(type=="monster1"){
			model.updateSprite(x, y, "g");
		}else if(type=="monster2"){
			model.updateSprite(x, y, "h");
		}
		else if(type=="monster3"){
			model.updateSprite(x, y, "z");
		}
		else if(type=="monster4"){
			model.updateSprite(x, y, "r");
		}
		else if(type=="Spell"){
			model.updateSprite(x, y, "s");
		}
		
		
	}

	public void Action(String Object, String type) {
		// TODO Auto-generated method stub
		
	}

}
