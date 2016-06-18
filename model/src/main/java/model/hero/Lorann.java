package model.hero;

import model.Monster.Monster1;

public class Lorann{
	int x;
	int y;

	// Lorann method get x and y position of Lorann
	public Lorann(int x, int y) {
		this.x = x;
		this.y = y;
		Move move = new Move(4, "Lorann", x, y);
	}
	
}
