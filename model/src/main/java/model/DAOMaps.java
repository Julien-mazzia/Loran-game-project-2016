package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOMaps extends DAOEntity{
	int id;

	public DAOMaps(final Connection connection) throws SQLException {
		super(connection);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(java.lang.String)
	 */
	public Maps find1(int id_map) {
		Maps maps = new Maps();
		int x = 0;
		int y = 0;
		String Object = null;

		try {
			final String sql = "{call getMap(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, id_map);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				maps = new Maps(resultSet.getInt("Id_object"), resultSet.getInt("Id_map"), resultSet.getString("Object"), resultSet.getInt("x"), resultSet.getInt("y"));
			}
			return maps;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		System.out.println(id);
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
