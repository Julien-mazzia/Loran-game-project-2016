package contract;

import java.util.Observable;

/**
 * The Interface IView.
 *
 * @author Jean-Aymeric Diet
 */
public interface IView {

	/**
	 * Prints the message.
	 *
	 * @param message
	 *          the message
	 * @return 
	 */
	// print the first message
	int printMessage();
	//update
	public void update(final Observable arg0, final Object arg1);
	public void setElements(char[][] elements); 
	// create a new level
	public void newLevel();
}
