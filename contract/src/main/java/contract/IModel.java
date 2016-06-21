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
	 * Load the map with the movement of Lorann
	 * @param move : int
	 * @return
	 */
	char[][] loadNewMap(int move);
	/**
	 * Load the map
	 */
	char[][] loadNewMap();
	/**Create a new spell with his direction
	 * @param direction
	 */
	public void newSpell(int direction);
	/**
	 * Move all the objects without Lorann
	 * @param direction : int
	 * @param count : int
	 * @return
	 */
	public int moveObject(int direction, int count);
}
