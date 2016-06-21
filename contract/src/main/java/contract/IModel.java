package contract;

import java.util.Observable;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	String getMessage();

	/**
	 * Load the message.
	 *
	 * @param key
	 *          the key
	 */
	char [][] loadMessage(int level);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
	//Load the new map
	/**
	 * 
	 * @param move
	 * @return
	 */
	char[][] loadNewMap(int move);
	char[][] loadNewMap();
	//Load a spell
	public void newSpell();
	public void moveObject();
}
