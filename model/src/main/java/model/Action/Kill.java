package model.Action;

import model.Model;

public class Kill implements IAction {

	// This method kill the character
	public Kill(String type) {
		if(type=="Lorann"){
		}else if(type=="Monster1"){
			Model model = new Model();
			model.updateSprite(20, 20, "", "recover");
		}else if(type=="Monster2"){
			Model model = new Model();
			model.updateSprite(20, 20, "", "recover");
		}else if(type=="Monster3"){
			Model model = new Model();
			model.updateSprite(20, 20, "", "recover");
		}else if(type=="Monster4"){
			Model model = new Model();
			model.updateSprite(20, 20, "", "recover");
		}
	}

	public void Action(String Object, String type) {
		// TODO Auto-generated method stub

	}

}
