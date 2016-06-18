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
	 *          the new message
	 */
	private void setMessage(final String message) {
		this.message = message;
		this.setChanged();
		this.notifyObservers();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	public void loadMessage(final String key) {
		try {
			final DAOMaps daomaps = new DAOMaps(DBConnection.getInstance().getConnection());
			daomaps.find1();
			
			final DAOGetSprite daoSprite = new DAOGetSprite(DBConnection.getInstance().getConnection());
			daoSprite.getSprite(1, 0);
			
			final DAOUpdate daoUpdate = new DAOUpdate(DBConnection.getInstance().getConnection());
			daoUpdate.updateSprite(1, 4, "h");
			
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
