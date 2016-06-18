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
		if(comp1==ObjectComportement.BLOCKING || comp1==ObjectComportement.POINTS && type=="Monster"){
			Block block = new Block(type);
			System.out.println("Bonjour");
		}
		if(comp1==ObjectComportement.MORTAL && type!="Monster"){
			this.kill = new Kill(type);
			System.out.println("Salut");
		}
		if(comp1==ObjectComportement.POINTS){
			Points points = new Points(type);
			System.out.println("Hello");
		}
		if(comp1==ObjectComportement.LINKED && comp2==ObjectComportement.PENETRABLE){
			ChangeDoor door = new ChangeDoor();
			System.out.println("Hola");
		}
		if(comp2==ObjectComportement.PENETRABLE && comp1!=ObjectComportement.MORTAL){
			Movement move = new Movement(x, y, type);
			System.out.println("Hi");
		}
	}
	
	public Action(String NextType, String type){
		if(NextType == "Monster" && type == "Lorann"){
			this.kill = new Kill(type);
		}else if(NextType == "Lorann" && type == "Monster"){
			this.kill = new Kill(NextType);
		}
		
		if(NextType == "Monster" && type == "Spell"){
			this.kill = new Kill(type);
		}else if(NextType == "Spell" && type == "Monster"){
			this.kill = new Kill(NextType);
		}
		
		if(NextType == "Spell" && type == "Lorann" || NextType == "Lorann" && type == "Spell"){
			RecoverSpell spell = new RecoverSpell();
		}
	}

}
