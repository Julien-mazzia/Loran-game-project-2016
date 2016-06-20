package model;

import java.sql.SQLException;
import java.util.Observable;

import javax.swing.JOptionPane;

import contract.IController;
import contract.IModel;
import model.hero.Lorann;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel {

	/** The message. */
	private String message;
	
	private IController controller;

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.message = "";
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
	private void setMessage(final String message) {
		this.message = message;
		this.setChanged();
		this.notifyObservers();
	}

	// Must change this method name

	public char [][] loadMessage(final String key, int level) {
		char Elements[][]= null;
		try {
			final DAOMaps daomaps = new DAOMaps(DBConnection.getInstance().getConnection());
			Elements=daomaps.find1();
			return Elements;

		} catch (final SQLException e) {
			e.printStackTrace();
			Elements[0][0]=0;
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

	public char [][] loadNewMap(int move) {
		try {
			final DAONewMap daomaps = new DAONewMap(DBConnection.getInstance().getConnection());
			char Elements[][] = daomaps.find1(move);
			return Elements;
		} catch (final SQLException e) {
			e.printStackTrace();
			char Elements[][] = null;
			Elements[0][0]=0;
			return Elements;
		}
	}
	
	public char [][] loadNewMap() {
		try {
			final DAONewMap daomaps = new DAONewMap(DBConnection.getInstance().getConnection());
			char Elements[][] = daomaps.find1();
			return Elements;
		} catch (final SQLException e) {
			e.printStackTrace();
			char Elements[][] = null;
			Elements[0][0]=0;
			return Elements;
		}
	}
	
	public void newMap(){
		int level=5;
		String[] tabLevel = {"1","2","3","4"};
		//JOptionPane.showMessageDialog(null, message);
		JOptionPane jop = new JOptionPane();
		while(level==5){
		level = jop.showOptionDialog(null, "Choisissez votre niveau :", "Choix du niveau",  
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
				tabLevel, tabLevel[0]);
		}
		loadMessage("", level);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}

}
