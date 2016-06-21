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

	public Spell() {
		int tab[];
		File f = new File("OldMove");
		Model model = new Model();
		tab = model.LocateElement("l");
		int x = tab[0];
		int y = tab[1];
		try {
			FileReader fr = new FileReader(f);
			char c;
			try {
				// We read the file and get the latest move of Lorann
				c = (char) fr.read();
				SpellMove(c); // we save the movement of the spell
				switch (c) {
				case '1':
					Up up = new Up(x, y - 1, "Spell");
					break;
				case '2':
					Down down = new Down(x, y + 1, "Spell");
					break;
				case '3':
					Left left = new Left(x - 1, y, "Spell");
					break;
				case '4':
					Right right = new Right(x + 1, y, "Spell");
					break;

				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException exception) {
			System.out.println("Le fichier n'a pas été trouvé");
		}
	}

	/*
	 * this Spell collect the movement of the spell to move it
	 */
	public Spell(int x, int y) {
		File f = new File("SpellMove");
		try {
			FileReader fr = new FileReader(f);
			char c;
			try {
				c = (char) fr.read();
				SpellMove(c);
				switch (c) {
				case '1':
					Up up = new Up(x, y - 1, "Spell");
					break;
				case '2':
					Down down = new Down(x, y + 1, "Spell");
					break;
				case '3':
					Left left = new Left(x - 1, y, "Spell");
					break;
				case '4':
					Right right = new Right(x + 1, y, "Spell");
					break;

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// this method save the movement of the spell
	public void SpellMove(char move) {
		File f = new File("SpellMove");
		try {
			FileWriter fw = new FileWriter(f);
			fw.write(String.valueOf(move));
			fw.close();
		} catch (IOException exception) {
			System.out.println("Erreur lors de la lecture : " + exception.getMessage());
		}
	}

	// Invert the direction of the spell
	public void InvertSpell() {
		File f = new File("SpellMove");
		try {
			FileReader fr = new FileReader(f);
			char c;
			try {
				c = (char) fr.read();
				File f1;
				switch (c) {
				case '1':
					f1 = new File("SpellMove");
					try {
						FileWriter fw = new FileWriter(f);
						fw.write(String.valueOf(2));
						fw.close();
					} catch (IOException exception) {
						System.out.println("Erreur lors de la lecture : " + exception.getMessage());
					}
					break;
				case '2':
					f1 = new File("SpellMove");
					try {
						FileWriter fw = new FileWriter(f);
						fw.write(String.valueOf(1));
						fw.close();
					} catch (IOException exception) {
						System.out.println("Erreur lors de la lecture : " + exception.getMessage());
					}
					break;
				case '3':
					f1 = new File("SpellMove");
					try {
						FileWriter fw = new FileWriter(f);
						fw.write(String.valueOf(4));
						fw.close();
					} catch (IOException exception) {
						System.out.println("Erreur lors de la lecture : " + exception.getMessage());
					}
					break;
				case '4':
					f1 = new File("SpellMove");
					try {
						FileWriter fw = new FileWriter(f);
						fw.write(String.valueOf(3));
						fw.close();
					} catch (IOException exception) {
						System.out.println("Erreur lors de la lecture : " + exception.getMessage());
					}
					break;

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Spell(String none) {

	}
}
