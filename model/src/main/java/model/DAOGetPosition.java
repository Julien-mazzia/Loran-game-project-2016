package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOGetPosition extends DAOEntity {

	public DAOGetPosition(final Connection connection) throws SQLException {
		super(connection);
	}

	/*
	 * This method get the location of the element, element is a "String" to put
	 * in the database like "l". Then we have the x and y location
	 */

	public void getPosition(String element) {
		int x;
		int y;

		try {
			// getPosition sql procedure get the x and y position of the element
			final String sql = "{call getPosition(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setString(1, element);
			call.execute();
			ResultSet resultSet = call.getResultSet();

			if (resultSet.first()) {
				x = resultSet.getInt("x");
				y = resultSet.getInt("y");
				final DAOUpdate dao = new DAOUpdate(DBConnection.getInstance().getConnection());
				dao.updateSprite(x, y);
			}

		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * This method get the location of the element, element is a "String" to put
	 * in the database like "l". Then we have the x and y location and we can
	 * change the sprite. Ex : Serpent door -> ending door
	 */

	public void getPosition(String element, String sentence) {
		int x;
		int y;

		try {
			final String sql = "{call getPosition(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setString(1, element);
			call.execute();
			ResultSet resultSet = call.getResultSet();

			if (resultSet.first()) {
				x = resultSet.getInt("x");
				y = resultSet.getInt("y");
				final DAOUpdate dao = new DAOUpdate(DBConnection.getInstance().getConnection());
				// Here we will recove the serpent door by an ending door
				if (element == "s") {
					dao.updateSprite(x, y, "E", "recover");
				}
			}

		} catch (final SQLException e) {
			e.printStackTrace();
		}
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
