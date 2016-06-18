package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOMaps extends DAOEntity{
	private Maps maps;
	
	public DAOMaps(final Connection connection) throws SQLException {
		super(connection);
	}
	
	public Maps find1() {
		int x = 0;
		int y = 0;
		char Elements[][]= new char[15][20];
		String Element;
		char ChElement = 0;
		
		try {
			final String sql1 = "{call fillTable()}";
			final CallableStatement call1 = this.getConnection().prepareCall(sql1);
			call1.execute();
			final String sql = "{call getMap()}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.execute();
			ResultSet resultSet = call.getResultSet();
			
			while(resultSet.next()){
				x = resultSet.getInt("x");
				y = resultSet.getInt("y");
				Element = resultSet.getString("Object");
				if(Element.length()>0){
					ChElement = Element.charAt(0);
				}else{
					ChElement = '-';
				}
				Elements[x][y] = ChElement;
			}
			maps = new Maps(Elements);
			return maps;
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
