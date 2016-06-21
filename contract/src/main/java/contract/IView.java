package contract;

import java.util.Observable;

/**
 * The Interface IView.
 *
 * @author Jean-Aymeric Diet
 */
public interface IView {

	
	int printMessage();
	/**Update the table
	 * @param arg0
	 * @param arg1
	 */
	public void update(final Observable arg0, final Object arg1);
	
	public void setElements(char[][] elements); 
	
	/**
	 * create a new level
	 */
	public void newLevel();
}
