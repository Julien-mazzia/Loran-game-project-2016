package model;

import model.Action.Action;
import model.Action.Movement;
import model.object.EndingDoor;
import model.object.EnergeticBubble;
import model.object.HorizontalBone;
import model.object.Kneecap;
import model.object.Purse;
import model.object.SerpentDoor;
import model.object.VerticalBone;

public class GetSprite {

	private Action action;

	/*
	 * After getting the element, we send it directly to Action if the element
	 * already exist as an object, or to is appropriate element creator
	 */

	public GetSprite(char element, int x, int y, String type) {
		switch (element) {
		case 'l':
			action = new Action("Lorann", type);
			break;
		case 'g':
			action = new Action("monster1", type);
			break;
		case 'h':
			action = new Action("monster2", type);
			break;
		case 'z':
			action = new Action("monster3", type);
			break;
		case 'r':
			action = new Action("monster4", type);
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
			action = new Action("Spell", type);
			break;
		default:
			Movement move = new Movement(x, y, type);
			break;
		}
	}

}
