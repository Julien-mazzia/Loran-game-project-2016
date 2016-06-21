package model.Action;

import model.hero.Spell;

public class Block implements IAction {

	/*
	 * This method block the character (so nothing happened) or call InvertSpell in
	 * model/src/main/java/model.hero/spell
	 */
	public Block(String type) {
		if(type=="Spell"){
			Spell spell = new Spell("");
			spell.InvertSpell();
		}
	}

	public void Action(String Object, String type) {
		// TODO Auto-generated method stub

	}

}
