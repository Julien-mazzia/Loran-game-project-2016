package model.Action;

import contract.ControllerOrder;
import contract.IController;
import model.Model;

public class Kill implements IAction, IController {
	// This method kill the character
	public Kill(String type) {
		int tab[];
		int x;
		int y;
		if(type=="Lorann"){
			Model model = new Model();
			model.newMap();
		}else if(type=="monster1"){
			Model model = new Model();
			tab=model.LocateElement("g");
			x = tab[0];
			y = tab[1];
			model.updateSprite(x, y, "", "recover");
			tab=model.LocateElement("S");
			x = tab[0];
			y = tab[1];
			model.updateSprite(x, y, "", "recover");
		}else if(type=="monster2"){
			Model model = new Model();
			tab=model.LocateElement("h");
			x = tab[0];
			y = tab[1];
			model.updateSprite(x, y, "", "recover");
			tab=model.LocateElement("S");
			x = tab[0];
			y = tab[1];
		}else if(type=="monster3"){
			Model model = new Model();
			tab=model.LocateElement("z");
			x = tab[0];
			y = tab[1];
			model.updateSprite(x, y, "", "recover");
			tab=model.LocateElement("S");
			x = tab[0];
			y = tab[1];
		}else if(type=="monster4"){
			Model model = new Model();
			tab=model.LocateElement("r");
			x = tab[0];
			y = tab[1];
			model.updateSprite(x, y, "", "recover");
			tab=model.LocateElement("S");
			x = tab[0];
			y = tab[1];
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

	public void setDirection(int direction) {
		// TODO Auto-generated method stub
		
	}

}
