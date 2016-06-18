package model.hero;

import java.awt.event.KeyListener;

import model.Monster.Monster;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class Lorann implements KeyListener {
	int x;
	int y;

	// Lorann method get x and y position of Lorann
	public Lorann(int x, int y) {
		
		//Monster monster = new Monster(5, 10);
		Move move = new Move(4, "Lorann", x, y);
	}
	
	public void Location(int x, int y){
		this.x = x;
		this.y = y;
	}

	// Implemented method from KeyListener
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	// This method recover the key pressed to move Lorann
	public void keyPressed(KeyEvent e) {
		/*
		 * int key = e.getKeyChar(); switch(key){ case 122://z break; case
		 * 113://q break; case 115://s break; case 100://d break;
		 */

		// TODO Auto-generated method stub

	}

	// Implemented method from KeyListener
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
