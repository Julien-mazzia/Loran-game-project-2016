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
	public Maps find1() {
		Maps maps = new Maps();
		int x = 0;
		int y = 0;
		char Elements[][]= new char[15][20];
		String Element;
		char ChElement = 0;
		String Object = null;
		int comp = 2;
		
		try {
			final String sql = "{call getMap()}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			//call.setInt(1, comp);
			//call.execute();
			ResultSet resultSet = call.getResultSet();
			
			//call.setInt(1, comp);
			call.execute();
			resultSet = call.getResultSet();
			
			while(resultSet.next()){
				x = resultSet.getInt("x");
				y = resultSet.getInt("y");
				Element = resultSet.getString("Object");
				if(Element.length()>0){
					ChElement = Element.charAt(0);
				}else{
					ChElement = '-';
				}
				/*char* un;
				string deux;
				char c = s.charAt(0);*/
				Elements[x][y] = ChElement;
				//System.out.println(Elements[x][y]);
				//System.out.println("X :"+x+" Y :"+y+" Element :"+ChElement);
				
				comp++;
			}
			
			/*for(int k=0; k<15; k++){
				for(int l=0; l<19; l++){
					
					System.out.println("Element : "+ Elements[k][l]);
					
				}
			
		}*/
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
