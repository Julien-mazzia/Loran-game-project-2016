package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAONewMap extends DAOEntity {

	private Maps maps;

	public DAONewMap(final Connection connection) throws SQLException {
		super(connection);
	}

	// This method get the new changed map

	public char[][] find1(int move) {
		int x = 0;
		int y = 0;
		char Elements[][] = new char[20][15];
		String Element;
		char ChElement = 0;

		try {

			// This procedure will get the new map
			final String sql = "{call getNewMap()}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.execute();
			ResultSet resultSet = call.getResultSet();

			while (resultSet.next()) {
				x = resultSet.getInt("x");
				y = resultSet.getInt("y");
				Element = resultSet.getString("Object");

				// change the element to String to char
				if (Element.length() > 0) {
					ChElement = Element.charAt(0);
				} else {
					ChElement = '-';
				}

				// Then fill the table Elements
				Elements[x][y] = ChElement;
			}
			// Send the result to Maps
			maps = new Maps(Elements, move);
			return Elements;
		} catch (final SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public char[][] find1() {
		int x = 0;
		int y = 0;
		char Elements[][] = new char[20][15];
		String Element;
		char ChElement = 0;

		try {

			// This procedure will get the new map
			final String sql = "{call getNewMap()}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.execute();
			ResultSet resultSet = call.getResultSet();

			while (resultSet.next()) {
				x = resultSet.getInt("x");
				y = resultSet.getInt("y");
				Element = resultSet.getString("Object");

				// change the element to String to char
				if (Element.length() > 0) {
					ChElement = Element.charAt(0);
				} else {
					ChElement = '-';
				}

				// Then fill the table Elements
				Elements[x][y] = ChElement;
			}
			// Send the result to Maps
			return Elements;
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
