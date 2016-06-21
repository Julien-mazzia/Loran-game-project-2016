package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.io.IOException;

import javax.swing.Timer;

import model.Monster.Monster1;
import model.Monster.Monster2;
import model.Monster.Monster3;
import model.Monster.Monster4;
import model.hero.Spell;

public class MoveObjects {
	int tab[];
	int tab1[];
	int direction;
	
	public MoveObjects(){
		
	}
	
	public int Movement(int direction, int count) {
		Model model = new Model();
		tab = model.LocateElement("l");
		int xL = tab[0];
		int yL = tab[1];
		tab1 = model.LocateElement("g");
		int x = tab1[0];
		int y = tab1[1];
		Monster1 monster1 = new Monster1(x, y, xL, yL);
		//Model model = new Model();
		tab1 = model.LocateElement("h");
		x = tab1[0];
		y = tab1[1];
		Monster2 monster2 = new Monster2(x, y, xL, yL);
		tab1 = model.LocateElement("z");
		x = tab1[0];
		y = tab1[1];
		Monster3 monster3 = new Monster3(x, y, xL, yL);
		tab1 = model.LocateElement("r");
		x = tab1[0];
		y = tab1[1];
		Monster4 monster4 = new Monster4(x, y, xL, yL);
		this.direction=direction;
		if(count!=0){
		tab1 = model.LocateElement("S");
		x = tab1[0];
		y = tab1[1];
		Spell spell = new Spell(direction, x, y);
		}
		try {
			Runtime.getRuntime().exec("cls");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.loadNewMap();
		return this.direction;
	}

}
