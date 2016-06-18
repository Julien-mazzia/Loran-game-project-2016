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

	public GetSprite(char element, int x, int y) {
		switch (element){
			case 'l':

				break;
			case 'm':

				break;
			case 'e':
				EnergeticBubble Bubble = new EnergeticBubble(x, y, "Lorann");
				break;
			case 'p':
				Purse purse = new Purse(x, y, "Lorann");
				break;
			case 'E':
				EndingDoor door = new EndingDoor(x, y, "Lorann");
				break;
			case 's':
				SerpentDoor serpDoor = new SerpentDoor(x, y, "Lorann");
				break;
			case 'b':
				HorizontalBone hBone = new HorizontalBone(x, y, "Lorann");
				break;
			case 'B':
				VerticalBone vBone = new VerticalBone(x, y, "Lorann");
				break;
			case 'k':
				Kneecap knee = new Kneecap(x, y, "Lorann");
				break;
			case 'f':
				break;
			default :
				Movement move = new Movement(x, y, "l");
				break;
		}
	}

}
