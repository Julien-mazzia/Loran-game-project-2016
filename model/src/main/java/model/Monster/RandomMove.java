package model.Monster;

import java.util.Random;

import model.Mobile.Down;
import model.Mobile.Left;
import model.Mobile.Right;
import model.Mobile.Up;

public class RandomMove implements IMonster {

	// This method will make a random move of the monster
	public RandomMove(int x, int y) {
		//Random random = new Random();
		int choice = /*0+random.nextInt()*/0;
		switch(choice){
			case 0 :
				Up up = new Up(x,y,"monster");
				break;
			case 1 :
				Down down = new Down(x,y,"monster");
				break;
			case 2 :
				Left left = new Left(x,y,"monster");
				break;
			case 3 :
				Right right = new Right(x,y,"monster");
				break;
		}
	}

	public void Monster(int x, int y) {
		// TODO Auto-generated method stub

	}

}
