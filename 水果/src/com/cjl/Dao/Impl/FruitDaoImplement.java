package com.cjl.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cjl.Bean.Fruit;
import com.cjl.Dao.FruitDao;
import com.cjl.Tool.JDBCUtils;

public class FruitDaoImplement implements FruitDao{

	private static ResultSet rs =null;
    private static Connection conn = null;
    PreparedStatement preparedStatement =null;
    
    public FruitDaoImplement() {
    	conn = JDBCUtils.getConn();
	}
    
    
	@Override
	public Fruit selectFruitById(Fruit fruit) {
		// TODO 自动生成的方法存根
		String sql = "SELECT * FROM fruit_information where id = ?";
		boolean flag = false;
		Fruit selectFruit = new Fruit();
		try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, fruit.getId());
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
            	flag = true;
            	selectFruit.setId(rs.getInt("id"));
            	selectFruit.setName(rs.getString("name"));
            	selectFruit.setPrice(rs.getDouble("price"));
            	selectFruit.setUnit(rs.getString("unit"));
            	selectFruit.setQuantiny(rs.getInt("quantiny"));
            	selectFruit.setType(rs.getString("type"));
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
		if(flag == true) {
			return selectFruit;
		}
		else {
			return null;
		}
	}

	@Override
	public Fruit selectFruitByName(Fruit fruit) {
		// TODO 自动生成的方法存根
		String sql = "SELECT * FROM fruit_information where name = ?";
		boolean flag = false;
		Fruit selectFruit = new Fruit();
		try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, fruit.getName());
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
            	flag = true;
            	selectFruit.setId(rs.getInt("id"));
            	selectFruit.setName(rs.getString("name"));
            	selectFruit.setPrice(rs.getDouble("price"));
            	selectFruit.setUnit(rs.getString("unit"));
            	selectFruit.setQuantiny(rs.getInt("quantiny"));
            	selectFruit.setType(rs.getString("type"));
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
		if(flag == true) {
			return selectFruit;
		}
		else {
			return null;
		}
	}
	
	@Override
	public Fruit selectFruitByPrice(Fruit fruit) {
		// TODO 自动生成的方法存根
		String sql = "SELECT * FROM fruit_information where price = ?";
		boolean flag = false;
		Fruit selectFruit = new Fruit();
		try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setDouble(1, fruit.getPrice());
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
            	flag = true;
            	selectFruit.setId(rs.getInt("id"));
            	selectFruit.setName(rs.getString("name"));
            	selectFruit.setPrice(rs.getDouble("price"));
            	selectFruit.setUnit(rs.getString("unit"));
            	selectFruit.setQuantiny(rs.getInt("quantiny"));
            	selectFruit.setType(rs.getString("type"));
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
		if(flag == true) {
			return selectFruit;
		}
		else {
			return null;
		}
	}


	@Override
	public Fruit selectFruitByType(Fruit fruit) {
		// TODO 自动生成的方法存根
		String sql = "SELECT * FROM fruit_information where type = ?";
		boolean flag = false;
		Fruit selectFruit = new Fruit();
		try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, fruit.getType());
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
            	flag = true;
            	selectFruit.setId(rs.getInt("id"));
            	selectFruit.setName(rs.getString("name"));
            	selectFruit.setPrice(rs.getDouble("price"));
            	selectFruit.setUnit(rs.getString("unit"));
            	selectFruit.setQuantiny(rs.getInt("quantiny"));
            	selectFruit.setType(rs.getString("type"));
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
		if(flag == true) {
			return selectFruit;
		}
		else {
			return null;
		}
	}

	@Override
	public int deleteFruitById(Fruit fruit) {
		// TODO 自动生成的方法存根
		String sql = "DELETE FROM fruit_information where id = ?";
		int rows = 0;
		try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, fruit.getId());
            rows = preparedStatement.executeUpdate();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
		return rows;
	}


	@Override
	public int insertFruitByFruit(Fruit fruit) {
		// TODO 自动生成的方法存根
		String sql = "INSERT INTO fruit_information (id, name, price, unit, quantiny, TYPE) VALUES (?, ?, ?, ?, ?, ?);";
		int rows = 0;
		try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, fruit.getId());
            preparedStatement.setString(2, fruit.getName());
            preparedStatement.setDouble(3, fruit.getPrice());
            preparedStatement.setString(4, fruit.getUnit());
            preparedStatement.setInt(5, fruit.getQuantiny());
            preparedStatement.setString(6, fruit.getType());
            rows = preparedStatement.executeUpdate();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
		return rows;
	}


	@Override
	public int updateFruitByFruit(Fruit oldFruit,Fruit newFruit) {
		
		// TODO 自动生成的方法存根
		String sql = "UPDATE fruit_information SET id = ? , NAME = ? , price = ? , unit = ? , quantiny = ? , TYPE = ? WHERE id = ?;";
		int rows = 0;
		try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, newFruit.getId());
            preparedStatement.setString(2, newFruit.getName());
            preparedStatement.setDouble(3, newFruit.getPrice());
            preparedStatement.setString(4, newFruit.getUnit());
            preparedStatement.setInt(5, newFruit.getQuantiny());
            preparedStatement.setString(6, newFruit.getType());
            preparedStatement.setInt(7, oldFruit.getId());
            rows = preparedStatement.executeUpdate();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
		return rows;
	}


	@Override
	public ArrayList<Fruit> selectAllFruit() {
		// TODO 自动生成的方法存根
		String sql = "select * from fruit_information";
		ArrayList<Fruit> fruits = new ArrayList<>();
		try {
            preparedStatement = conn.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
            	Fruit selectFruit = new Fruit();
            	selectFruit.setId(rs.getInt("id"));
            	selectFruit.setName(rs.getString("name"));
            	selectFruit.setPrice(rs.getDouble("price"));
            	selectFruit.setUnit(rs.getString("unit"));
            	selectFruit.setQuantiny(rs.getInt("quantiny"));
            	selectFruit.setType(rs.getString("type"));
            	fruits.add(selectFruit);
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return fruits;
	}


	@Override
	public int updateFruitByType(Fruit oldFruit, Fruit newFruit) {
		// TODO 自动生成的方法存根
				String sql = "UPDATE fruit_information SET type = ? WHERE type = ?;";
				int rows = 0;
				try {
					preparedStatement = conn.prepareStatement(sql);
					preparedStatement.setString(1, newFruit.getType());
		            preparedStatement.setString(2, oldFruit.getType());
		            
		            rows = preparedStatement.executeUpdate();
		            
		            
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
				
				return rows;
	}


	@Override
	public int deleteFruitByType(Fruit fruit) {
		// TODO 自动生成的方法存根
				String sql = "DELETE FROM fruit_information where type = ?";
				int rows = 0;
				try {
		            preparedStatement = conn.prepareStatement(sql);
		            preparedStatement.setString(1, fruit.getType());
		            rows = preparedStatement.executeUpdate();
		            
		            
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
				
				return rows;
	}


	

}
