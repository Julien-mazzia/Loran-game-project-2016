package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.hero.Lorann;

public class DAOUpdate extends DAOEntity {

	public DAOUpdate(final Connection connection) throws SQLException {
		super(connection);
	}

	/*
	 * This method update the location of the element because he can move to his
	 * next location. So we update the next sprite with the element.
	 */

	public Maps updateSprite(int x, int y, String element) {

		try {
			final String sql = "{call updateSprite(?,?,?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, x);
			call.setInt(2, y);
			call.setString(3, element);
			call.execute();

			final DAOGetPosition dao = new DAOGetPosition(DBConnection.getInstance().getConnection());
			dao.getPosition(element);
		} catch (final SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	/*
	 * This method update the older location of the element because he can move
	 * to his next location. So we update the previous sprite with nothing.
	 */

	public Maps updateSprite(int x, int y) {

		try {
			final String sql = "{call updateSprite(?,?,?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, x);
			call.setInt(2, y);
			call.setString(3, "");
			call.execute();
			return null;
		} catch (final SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	/*
	 * This method update the location of a motionless element because he can't
	 * move. So we update the sprite with the new element if he change of
	 * statement, or by nothing if he disappear
	 */

	public Maps updateSprite(int x, int y, String element, String sentence) {

		try {
			final String sql = "{call updateSprite(?,?,?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			final DAOGetPosition dao = new DAOGetPosition(DBConnection.getInstance().getConnection());
			if (sentence == "no recover") {
				dao.getPosition(element, "no recover");
			}
			call.setInt(1, x);
			call.setInt(2, y);
			call.setString(3, element);
			call.execute();
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
