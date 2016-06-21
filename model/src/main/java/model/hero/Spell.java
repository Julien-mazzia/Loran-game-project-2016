package model.hero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import model.Model;
import model.Mobile.Down;
import model.Mobile.Left;
import model.Mobile.Right;
import model.Mobile.Up;

public class Spell {

	/*
	 * Spell collect the movement of Lorann to cast the spell on the same way as
	 * Lorann
	 */

	public Spell(int direction, int x, int y) {
				switch (direction) {
				case -1:
					Up up = new Up(x, y - 1, "Spell");
					break;
				case 1:
					Down down = new Down(x, y + 1, "Spell");
					break;
				case -2:
					Left left = new Left(x - 1, y, "Spell");
					break;
				case 2:
					Right right = new Right(x + 1, y, "Spell");
					break;

				}
	}

	// Invert the direction of the spell
	public void InvertSpell() {
		Model model = new Model();
		model.setDirection(-1);
	}

	public Spell() {

	}
}
