package model.Monster;

import model.Mobile.Down;
import model.Mobile.Left;
import model.Mobile.Right;
import model.Mobile.Up;

public class Chase implements IMonster {

	// Chase will guide the monster to Lorann
	public Chase(int x, int y, int xL, int yL, String type) {
		
		if(xL>x){
			Right right = new Right(x+1,y,type);
		}
		if(xL<x){
			Left left = new Left(x-1,y,type);
		}
		if(yL>y){
			Down down = new Down(x,y+1,type);
		}
		if(yL<y){
			Up up = new Up(x,y-1,type);
		}
	}

	public void Monster(int x, int y) {
		// TODO Auto-generated method stub

	}

}
