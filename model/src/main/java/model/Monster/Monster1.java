package model.Monster;

public class Monster1 {
	int x;
	int y;

	// Monster method get x and y position of Monster
	public Monster1(int x, int y, int xL, int yL) {
		this.x = x;
		this.y = y;
		int deltaX = Math.abs(xL-x);
		int deltaY = Math.abs(yL-y);
		if(deltaX<=3 && deltaY<=3){
			Chase chase = new Chase(x, y, xL, yL, "monster1");
		}else{
			RandomMove random = new RandomMove(x,y, "monster1");
		 
		}
		 
	}

	/**
	 * @return x corresponding at 
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 */
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
