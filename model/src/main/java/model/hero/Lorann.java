package model.hero;

import model.Monster.Monster1;

public class Lorann{
	int x;
	int y;

	// Lorann method get x and y position of Lorann
	public Lorann(int x, int y, int movement) {
		this.x = x;
		this.y = y;
		Move move = new Move(movement, "Lorann", x, y);
	}
	
}
