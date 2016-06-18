package model;

import model.Action.Movement;
import model.object.EndingDoor;
import model.object.EnergeticBubble;
import model.object.HorizontalBone;
import model.object.Kneecap;
import model.object.Purse;
import model.object.SerpentDoor;
import model.object.VerticalBone;

public class GetSprite {

	public GetSprite(char element, int x, int y, String type) {
		switch (element){
			case 'l':

				break;
			case 'g':

				break;
			case 'h':

				break;
			case 'z':

				break;
			case 'r':

				break;
			case 'e':
				EnergeticBubble Bubble = new EnergeticBubble(x, y, type);
				break;
			case 'p':
				Purse purse = new Purse(x, y, type);
				break;
			case 'E':
				EndingDoor door = new EndingDoor(x, y, type);
				break;
			case 's':
				SerpentDoor serpDoor = new SerpentDoor(x, y, type);
				break;
			case 'b':
				HorizontalBone hBone = new HorizontalBone(x, y, type);
				break;
			case 'B':
				VerticalBone vBone = new VerticalBone(x, y, type);
				break;
			case 'k':
				Kneecap knee = new Kneecap(x, y, type);
				break;
			case 'f':
				break;
			default :
				Movement move = new Movement(x, y, type);
				break;
		}
	}

}
