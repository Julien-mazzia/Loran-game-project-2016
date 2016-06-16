package model.hero;

import model.Mobile.Down;
import model.Mobile.Left;
import model.Mobile.Right;
import model.Mobile.Up;

public class Move {
	
	private Up up;
	private Down down;
	private Left left;
	private Right right;
	
	private Lorann lorann;
	
	public int x;
	public int y;

	public Move(int move, String type , int x, int y) {
		
		switch(move){
			case 1:
				up = new Up(x, y, type);
				break;
			case 2:
				down = new Down(x, y, type);
				break;
			case 3:
				left = new Left(x, y, type);
				break;
			case 4:
				right = new Right(x, y, type);
				break;
		}
	}

}
