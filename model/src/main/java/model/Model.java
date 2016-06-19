package model;

import java.sql.SQLException;
import java.util.Observable;

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

	public void loadMessage(final String key) {
		try {
			final DAOMaps daomaps = new DAOMaps(DBConnection.getInstance().getConnection());
			daomaps.find1();

		} catch (final SQLException e) {
			e.printStackTrace();
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
			daoUpdate.updateSprite(x, y, type);

		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	// loadNewMap recover the mapChanges in the database

	public void loadNewMap(int move) {
		try {
			final DAONewMap daomaps = new DAONewMap(DBConnection.getInstance().getConnection());
			daomaps.find1(move);

		} catch (final SQLException e) {
			e.printStackTrace();
		}
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
