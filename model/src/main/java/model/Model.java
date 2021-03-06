package model;

import java.sql.SQLException;
import java.util.Observable;

import javax.swing.JOptionPane;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import model.hero.Lorann;
import model.hero.Spell;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel, IController {

	/** The message. */
	private String message;

	private IController controller;
	
	int direction;

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	public String getMessage() {
		return this.message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *            the new message
	 */
	private void setMessage() {
		this.message = message;
		this.setChanged();
		this.notifyObservers();
	}

	// loadMessage will recover the wanted level
	public char[][] loadMessage(int level) {
		char Elements[][] = null;
		try {
			final DAOMaps daomaps = new DAOMaps(DBConnection.getInstance().getConnection());
			Elements = daomaps.find1();
			return Elements;

		} catch (final SQLException e) {
			e.printStackTrace();
			Elements[0][0] = 0;
			return Elements;
		}

	}

	// loadSprite will send to getSprite all the data it need to have

	public void loadSprite(int x, int y, String type) {
		try {
			final DAOGetSprite daoSprite = new DAOGetSprite(DBConnection.getInstance().getConnection());
			daoSprite.getSprite(x, y, type);

		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	// LoacteElement will send back the x and y location of the element

	public int[] LocateElement(String type) {
		int tab[] = null;
		try {
			final DAOGetPosition daoSprite = new DAOGetPosition(DBConnection.getInstance().getConnection());
			tab = daoSprite.getPositionElement(type);
			return tab;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return tab;
	}

	// updateSprite will send to the correct updateSprite all the data it need
	// to have

	public void updateSprite(int x, int y, String type) {
		try {

			final DAOUpdate daoUpdate = new DAOUpdate(DBConnection.getInstance().getConnection());
			daoUpdate.updateSprite(x, y, type);
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	// updateSprite will send to the correct updateSprite all the data it need
	// to have

	public void updateSprite(int x, int y, String type, String sentence) {
		try {
			final DAOUpdate daoUpdate = new DAOUpdate(DBConnection.getInstance().getConnection());
			daoUpdate.updateSprite(x, y, type, sentence);

		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	// loadNewMap recover the mapChanges in the database

	/* (non-Javadoc)
	 * @see contract.IModel#loadNewMap(int)
	 */
	public char[][] loadNewMap(int move) {
		try {
			final DAONewMap daomaps = new DAONewMap(DBConnection.getInstance().getConnection());
			char Elements[][] = daomaps.find1(move);
			return Elements;
		} catch (final SQLException e) {
			e.printStackTrace();
			char Elements[][] = null;
			Elements[0][0] = 0;
			return Elements;
		}
	}

	// loadNewMap recover the mapChanges in the database

	public char[][] loadNewMap() {
		try {
			final DAONewMap daomaps = new DAONewMap(DBConnection.getInstance().getConnection());
			char Elements[][] = daomaps.find1();
			return Elements;
		} catch (final SQLException e) {
			e.printStackTrace();
			char Elements[][] = null;
			Elements[0][0] = 0;
			return Elements;
		}
	}

	// newMap create the dialog panel and recover the level choosed

	public void newMap() {
		int level = 5;
		String[] tabLevel = { "1", "2", "3", "4" };
		JOptionPane jop = new JOptionPane();
		while (level == 5) {
			level = jop.showOptionDialog(null, "Choisissez votre niveau :", "Choix du niveau",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, tabLevel, tabLevel[0]);
		}
		loadMessage(level);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}

	// newSpell create a new spell only if there are none on the map

	public void newSpell(int direction) {
		int tab[] = new int[1];
		tab[0] = 0;
		tab = LocateElement("S");
		int tab2[] = LocateElement("l");
		int x=tab2[0];
		int y=tab2[1];
		if (tab[0] == 0) {
			Spell spell = new Spell(direction, x, y);
		}
	}
	public int moveObject(int direction, int count){
		this.direction = direction;
		MoveObjects move = new MoveObjects();
		direction = move.Movement(direction, count);
		return direction;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction= this.direction*direction;
	}

	public void control() {
		// TODO Auto-generated method stub
		
	}

	public void orderPerform(ControllerOrder controllerOrder) {
		// TODO Auto-generated method stub
		
	}

	public void setElements(char[][] elements) {
		// TODO Auto-generated method stub
		
	}

	public char[][] loadMap() {
		// TODO Auto-generated method stub
		return null;
	}
}
