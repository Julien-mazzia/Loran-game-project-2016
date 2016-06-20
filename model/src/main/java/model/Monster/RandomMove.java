package model.Monster;

import java.util.Random;

import model.Mobile.Down;
import model.Mobile.Left;
import model.Mobile.Right;
import model.Mobile.Up;

public class RandomMove implements IMonster {

	// This method will make a random move of the monster
	public RandomMove(int x, int y, String type) {
		Random r = new Random();
		int choice = 1+r.nextInt(5-1);
		switch(choice){
		case 1:
			Left left = new Left(x, y-1, type);
			break;
		case 2:
			Down down = new Down(x, y+1, type);
			break;
		case 3:
			Up up = new Up(x-1, y, type);
			break;
		case 4:
			Right right = new Right(x+1, y, type); //R: y+1
			break;
		}
	}

	public void Monster(int x, int y) {
		// TODO Auto-generated method stub
	
	}
}
