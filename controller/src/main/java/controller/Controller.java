package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController {

	/** The view. */
	private IView		view;

	/** The model. */
	private IModel	model;
	
	private char Elements[][];

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		int level = view.printMessage("Appuyer sur les touches 'E', 'F', 'D' ou 'I', pour afficher Hello world dans la langue d votre choix.");
		this.setView(view);
		this.setModel(model);
		Elements=this.model.loadMessage("GB", level);
		this.view.setElements(Elements);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see contract.IController#control()
	 */
	public void control() {
		}

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
		switch (controllerOrder) {
			case UP:
				Elements = this.model.loadNewMap(1);
				this.view.setElements(Elements);
				break;
			case DOWN:
				Elements = this.model.loadNewMap(2);
				this.view.setElements(Elements);
				break;
			case LEFT:
				Elements = this.model.loadNewMap(3);
				this.view.setElements(Elements);
				break;
			case RIGHT:
				Elements = this.model.loadNewMap(4);
				this.view.setElements(Elements);
				break;
			case SPACE:
				this.model.newSpell();
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
	
}
