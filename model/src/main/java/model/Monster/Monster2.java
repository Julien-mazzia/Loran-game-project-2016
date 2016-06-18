package model.Monster;

public class Monster2 {
	int x;
	int y;

	// Monster method get x and y position of Monster
	public Monster2(int x, int y) {
		this.x = x;
		this.y = y;
		//if(xLorann>4 || yLorann>4){
		RandomMove random = new RandomMove(x,y, "monster2");
		/* }else{
		 * Chase chase = new Chase(xLorann, YLorann)
		 * 
		 * }
		 */
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
