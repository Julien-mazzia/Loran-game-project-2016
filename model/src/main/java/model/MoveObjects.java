package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.io.IOException;

import javax.swing.Timer;

import model.Monster.Monster1;

public class MoveObjects implements ActionListener {
	Timer timer = new Timer(1000,this);
	int tab[];
	int tab1[];
	public MoveObjects() {
		timer.start();
		
		
	}
	public void actionPerformed(ActionEvent e) {
		Console console = System.console();    
		Model model = new Model();
		tab = model.LocateElement("l");
		int xL = tab[0];
		int yL = tab[1];
		tab1 = model.LocateElement("g");
		int x = tab1[0];
		int y = tab1[1];
		Monster1 monster1 = new Monster1(x, y, xL, yL);
		model.loadNewMap();
	}

}
