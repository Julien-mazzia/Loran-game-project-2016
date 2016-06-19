package model;

import model.Monster.Monster1;
import model.Monster.Monster2;
import model.Monster.Monster3;
import model.Monster.Monster4;
import model.hero.Lorann;

public class Maps {

	// This method recover the location of Lorann and of the monsters
	public Maps(char[][] Elements) {
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

		/*
		 * We find in all the table if the character exist and then send it to
		 * his creator
		 */
		for (int k = 0; k < 15; k++) {
			for (int l = 0; l < 19; l++) {

				if (Elements[k][l] == 'l') {
					xL = k;
					yL = l;
					Lorann lorann = new Lorann(xL, yL);
				}
				if (Elements[k][l] == 'g') {
					xG = k;
					yG = l;
					Monster1 monster1 = new Monster1(xG, yG);
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

			}

		}

	}

}
