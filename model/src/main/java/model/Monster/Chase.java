package model.Monster;

import model.Mobile.Down;
import model.Mobile.Left;
import model.Mobile.Right;
import model.Mobile.Up;

public class Chase implements IMonster {

	// Chase will guide the monster to Lorann
	public Chase(int x, int y, int xL, int yL, String type) {
		int move=0;
		if(yL<=y && move==0 && (xL-x<=-3) && (xL-x>=3)){
			System.out.println("up");
			Left left = new Left(x,y-1,type);
			move=1;
		}
		if(yL>=y && move==0 && (xL-x<=-3) && (xL-x>=3)){
			System.out.println("down");
			Down down = new Down(x, y+1, type);
			move=1;
		}
		if(xL<x && move==0){
			System.out.println("left");
			Up up = new Up(x-1, y, type);
			move=1;
		}
		if(xL>x&& move==0){
			System.out.println("right");
			Right right = new Right(x+1, y, type); //R: y+1
			move=1;
		}
	}
	public void Monster(int x, int y) {
		// TODO Auto-generated method stub

	}

}
