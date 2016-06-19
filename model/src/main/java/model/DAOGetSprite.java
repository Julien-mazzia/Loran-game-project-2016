package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOGetSprite extends DAOEntity {

	public DAOGetSprite(final Connection connection) throws SQLException {
		super(connection);
	}

	/*
	 * This method get the sprite in the x and y knew location
	 */

	public Maps getSprite(int x, int y, String type) {

		String Element;
		char ChElement = 0;

		try {
			final String sql = "{call getSprite(?,?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, x);
			call.setInt(2, y);
			call.execute();
			ResultSet resultSet = call.getResultSet();

			if (resultSet.first()) {
				// Element is the result of the getSprite procedure
				Element = resultSet.getString("Object");
				// if the element is consider as a char we can change him
				if (Element.length() > 0) {
					ChElement = Element.charAt(0);
					// if the element equal "null", he will be changed in -
				} else {
					ChElement = '-';
				}
			}
			GetSprite sprite = new GetSprite(ChElement, x, y, type);
			return null;
		} catch (final SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean create(Entity entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Entity entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Entity entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Entity find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity find(String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
