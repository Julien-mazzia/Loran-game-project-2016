package model.Action;

import model.Model;
import model.MoveObjects;
import model.hero.Spell;

public class Block implements IAction {

	/*
	 * This method block the character (so nothing happened) or call InvertSpell in
	 * model/src/main/java/model.hero/spell
	 */
	public Block(String type, int x, int y) {
		if(type=="Spell"){
			Model model = new Model();
			int tab[] = model.LocateElement("s");
			int xS = tab[0];
			int yS = tab[1];
			MoveObjects move = new MoveObjects();
			if(yS<y){
				model.moveObject(-1, 2);
			}
			if(yS>y){
				model.moveObject(1, 2);
			}
			if(xS<x){
				model.moveObject(2, 2);
			}
			if(xS>x){
				model.moveObject(-2, 2);
			}
		}
	}

	public void Action(String Object, String type) {
		// TODO Auto-generated method stub

	}

}
