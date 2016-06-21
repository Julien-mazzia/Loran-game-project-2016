package model.Action;

import model.Model;

public class RecoverSpell {
	//When Lorann recover is spell
	public RecoverSpell() {
		Model model = new Model();
		int tab[] = model.LocateElement("S");
		int x = tab[0];
		int y = tab[1];
		model.updateSprite(x, y, "", "recover");
	}

}
