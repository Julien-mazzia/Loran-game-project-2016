package model.Action;

import model.object.ObjectComportement;

public class Action {

	/*
	 * This method get the Object on the next case and the type of object which
	 * want to move on this sprite (Lorann, Monster, Spell) and will choose the
	 * appropriate action
	 */
	
	private Kill kill;
	public Action(ObjectComportement comp1, ObjectComportement comp2, ObjectComportement comp3, String type, int x, int y) {
		//If the next sprite is blocking for Lorann or a monster
		if(comp1==ObjectComportement.BLOCKING || comp1==ObjectComportement.POINTS && type=="Monster"){
			Block block = new Block(type);
		}
		//If there is the Ending door on the next sprite
		if(comp1==ObjectComportement.MORTAL && type!="Monster"){
			this.kill = new Kill(type);
		}
		//If there is a purse
		if(comp1==ObjectComportement.POINTS && type =="Lorann"){
			Points points = new Points();
		}
		//If there is an energetic Bubble on the next Sprite
		if(comp1==ObjectComportement.LINKED && comp2==ObjectComportement.PENETRABLE){
			ChangeDoor door = new ChangeDoor();
		}
		//If the object is penetrable
		if(comp2==ObjectComportement.PENETRABLE && comp1!=ObjectComportement.MORTAL && type =="Lorann"){
			Movement move = new Movement(x, y, type);
		}
	}
	
	public Action(String NextType, String type){
		if((NextType == "monster1" || NextType == "monster2" || NextType == "monster3" || NextType == "monster4") && type == "Lorann"){
			this.kill = new Kill(type);
		}else if(NextType == "Lorann" && (NextType == "monster1" || NextType == "monster2" || NextType == "monster3" || NextType == "monster4")){
			this.kill = new Kill(NextType);
		}
		
		if((NextType == "monster1" || NextType == "monster2" || NextType == "monster3" || NextType == "monster4") && type == "Spell"){
			this.kill = new Kill(type);
		}else if(NextType == "Spell" && (NextType == "monster1" || NextType == "monster2" || NextType == "monster3" || NextType == "monster4")){
			this.kill = new Kill(NextType);
		}
		
		if(NextType == "Spell" && type == "Lorann" || NextType == "Lorann" && type == "Spell"){
			RecoverSpell spell = new RecoverSpell();
		}
	}

}
