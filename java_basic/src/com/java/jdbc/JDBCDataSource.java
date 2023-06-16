package com.java.jdbc;

import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.ibatis.io.Resources;

public class JDBCDataSource extends AbstractMyDataSource{
	
	//jdbc connection�ϴ� class
	
	//�̱���
	private static JDBCDataSource instance = new JDBCDataSource();
	private JDBCDataSource() {}
	public static JDBCDataSource getInstance() {
		return instance;
	}
		
	{
		try {
			// 1. driver loading �� DriverManager(properties�� abstract�� ����)
			Class.forName(properties.getProperty("driver"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Connection getConnection() throws SQLException{
		// 2. get connection
		this.conn = DriverManager.getConnection(
								properties.getProperty("url"), 
								properties.getProperty("username"), 
								properties.getProperty("password"));
		return conn;
	}
	
	
	
}
