package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOUpdate extends DAOEntity{

	public DAOUpdate(final Connection connection) throws SQLException {
		super(connection);
	}
	
	public Maps updateSprite(int x, int y, String element) {
		
		try {
			final String sql = "{call updateSprite(?,?,?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, x);
			call.setInt(2, y);
			call.setString(3, element);
			//ResultSet resultSet = call.getResultSet();
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
