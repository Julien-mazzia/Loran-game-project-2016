package model.hero;


public class Lorann{
	int x;
	int y;

	// Lorann method get x and y position of Lorann
	public Lorann(int x, int y) {
		this.x = x;
		this.y = y;
		//Monster monster = new Monster(5, 10);
		Move move = new Move(4, "Lorann", x, y);
	}
	
}
