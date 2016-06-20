package model.Action;

import contract.ControllerOrder;
import contract.IController;
import model.Model;

public class Kill implements IAction, IController {
	// This method kill the character
	public Kill(String type) {
		
		if(type=="Lorann"){
			Model model = new Model();
			model.newMap();
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

	public void control() {
		// TODO Auto-generated method stub
		
	}

	public void orderPerform(ControllerOrder controllerOrder) {
		// TODO Auto-generated method stub
		
	}

	public void setElements(char[][] elements) {
		// TODO Auto-generated method stub
		
	}

	public char[][] loadMap() {
		// TODO Auto-generated method stub
		return null;
	}

}
