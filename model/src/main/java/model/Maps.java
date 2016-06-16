package model;

import model.hero.Lorann;

public class Maps {
	/** The id. */
	private int			id;

	/** The key. */
	private int	id_map;

	/** The message. */
	private String	object;
	
	private int x;
	
	private int y;
	
	private Lorann lorann;

	public Maps(final int ID_object, final int ID_map, final String Object, final int x, final int y) {
		this.setId(ID_object);
		this.setId_map(ID_map);
		this.setObject(Object);
		this.setX(x);
		this.setY(y);
		System.out.println(Object);
		lorann = new Lorann();
		lorann.Location(x, y);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_map() {
		return id_map;
	}

	public void setId_map(int id_map) {
		this.id_map = id_map;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Instantiates a new hello world.
	 */
	public Maps() {
		this(0, 0, "", 0, 0);
	}

	
}
