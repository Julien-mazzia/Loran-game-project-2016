package model;

import model.Monster.Monster1;
import model.Monster.Monster2;
import model.Monster.Monster3;
import model.Monster.Monster4;
import model.hero.Lorann;
import model.hero.Spell;

public class Maps {
	int xL;
	int yL;

	int xG;
	int yG;

	int xH;
	int yH;

	int xZ;
	int yZ;

	int xR;
	int yR;
	
	int xS;
	int yS;
	// This method recover the location of Lorann, the spell and the monsters
	public Maps(char[][] Elements, int move) {
		

		/*
		 * We find in all the table if the character exist and then send it to
		 * his creator
		 */
		Model model = new Model();
		model.loadNewMap();
		for (int k = 0; k < 20; k++) {
			for (int l = 0; l < 15; l++) {

				if (Elements[k][l] == 'l') {
					xL = k;
					yL = l;
					Lorann lorann = new Lorann(xL, yL, move);
				}
				if (Elements[k][l] == 'g') {
					xG = k;
					yG = l;
					Monster1 monster1 = new Monster1(xG, yG, xL, yL);
				}
				if (Elements[k][l] == 'h') {
					xH = k;
					yH = l;
					Monster2 monster2 = new Monster2(xH, yH);
				}
				if (Elements[k][l] == 'z') {
					xZ = k;
					yZ = l;
					Monster3 monster3 = new Monster3(xZ, yZ);
				}
				if (Elements[k][l] == 'r') {
					xR = k;
					yR = l;
					Monster4 monster4 = new Monster4(xR, yR);
				}
				if(Elements[k][l] == 'S'){
					xS = k;
					yS = l;
					Spell spell = new Spell(xS, yS);
				}
				
				

			}

		}

	}

}
