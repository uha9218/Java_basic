package com.java.jdbc;

import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.ibatis.io.Resources;

public abstract class AbstractMyDataSource {
	protected Connection conn;
	protected Properties properties = new Properties();
	protected String path = "com/java/jdbc/jdbc.properties";
	
	//초기화블럭
	{
		try {
			Reader reader = Resources.getResourceAsReader(path);
			properties.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public abstract Connection getConnection() throws SQLException;
}
