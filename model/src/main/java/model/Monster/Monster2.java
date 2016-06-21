package model.Monster;

public class Monster2 {
	int x;
	int y;

	// Monster method get x and y position of Monster
	public Monster2(int x, int y, int xL, int yL) {
		this.x = x;
		this.y = y;
		int deltaX = Math.abs(xL-x);
		int deltaY = Math.abs(yL-y);
		if(deltaX<=3 && deltaY<=3){
			Chase chase = new Chase(x, y, xL, yL, "monster2");
		}else{
			RandomMove random = new RandomMove(x,y, "monster2");
		 
		}
		 
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
