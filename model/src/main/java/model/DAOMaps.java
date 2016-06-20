package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Mobile.Mobile;

public class DAOMaps extends DAOEntity {
	private Maps maps;

	public DAOMaps(final Connection connection) throws SQLException {
		super(connection);
	}

	// This method get the initial map

	public char [][] find1() {
		int x = 0;
		int y = 0;
		char Elements[][] = new char[20][15];
		String Element;
		char ChElement = 0;

		try {
			/*
			 * fillTable procedure fill the second table mapChanges with all the
			 * sprite of the current played map
			 */

			final String sql2 = "{call newMap()}";
			final CallableStatement call2 = this.getConnection().prepareCall(sql2);
			call2.execute();
			final String sql3 = "{call createNewMap()}";
			final CallableStatement call3 = this.getConnection().prepareCall(sql3);
			call3.execute();
			final String sql1 = "{call fillTable()}";
			final CallableStatement call1 = this.getConnection().prepareCall(sql1);
			call1.execute();

			/*
			 * getMap procedure get the initial map
			 * 
			 */

			final String sql = "{call getMap()}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.execute();
			ResultSet resultSet = call.getResultSet();

			while (resultSet.next()) {
				x = resultSet.getInt("x");
				y = resultSet.getInt("y");
				Element = resultSet.getString("Object");

				// Here, the element is change to String to char
				if (Element.length() > 0) {
					ChElement = Element.charAt(0);
				} else {
					ChElement = '-';
				}

				// Then we fill the table Elements
				Elements[x][y] = ChElement;
			}
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
