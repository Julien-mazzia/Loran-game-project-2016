package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController, ActionListener {

	/** The view. */
	private IView		view;

	/** The model. */
	private IModel	model;
	
	private char Elements[][];
	
	private int count=0;
	
	public int direction=0;
	Timer timer = new Timer(1000, this);

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		//Choose a level
		int level = view.printMessage();
		// send in parameter the objects
		this.setView(view);
		this.setModel(model);
		
		Elements=this.model.loadMessage(level); //load a new map
		timer.start();
		//this.view.setElements(Elements);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see contract.IController#control()
	 */

	/**
	 * Sets the view.
	 *
	 * @param view
	 *          the new view
	 */
	private void setView(final IView view) {
		this.view = view;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		char Elements[][] = null;
		switch (controllerOrder) { // switch on the movement order
			case UP: //if key z pressed
				Elements = this.model.loadNewMap(1); // load the new map and send the wanted movement
				this.view.setElements(Elements);
				break;
			case DOWN: //if key s pressed
				Elements = this.model.loadNewMap(2); // load the new map and send the wanted movement
				this.view.setElements(Elements);
				break;
			case LEFT: //if key q pressed
				Elements = this.model.loadNewMap(3); // load the new map and send the wanted movement
				this.view.setElements(Elements);
				break;
			case RIGHT: //if key l pressed
				Elements = this.model.loadNewMap(4); // load the new map and send the wanted movement
				this.view.setElements(Elements);
				break;
			case SPELL_UP: //if key space pressed
				direction = -1;
				this.model.newSpell(direction); // create a new spell
				break;
			case SPELL_DOWN: //if key space pressed
				direction = 1;
				this.model.newSpell(direction); // create a new spell
				break;
			case SPELL_LEFT: //if key space pressed
				direction = -2;
				this.model.newSpell(direction); // create a new spell
				break;
			case SPELL_RIGHT: //if key space pressed
				direction = 2;
				this.model.newSpell(direction); // create a new spell
				break;
			default:
				break;
		}
	}

	public void setElements(char[][] elements) {
		Elements = elements;
	}
	
	public char[][] loadMap(){
		return Elements;
		
	}

	public void control() {
		// TODO Auto-generated method stub
		
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public void actionPerformed(ActionEvent e) {
		direction = model.moveObject(direction, count);
		if(direction!=0){
			count=1;
		}else{
			count=0;
		}
		
	}
	
}
