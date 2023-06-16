package com.java.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;	//이 데이터 소스를 활용
//connection은 현 db를 유지하되 그외의 것을 다른방식으로 쓰고싶음
public class DBCP2JDBCDataSource extends AbstractMyDataSource{
	
	//싱글톤
	private static DBCP2JDBCDataSource instance = new DBCP2JDBCDataSource();
	private DBCP2JDBCDataSource() {}
	public static DBCP2JDBCDataSource getInstance() {
		return instance;
	}
	
	
	
	//JDBCDataSource싱글톤 때문에 JDBCDataSour가 private이라  extends 불가!
	private BasicDataSource dataSource = new BasicDataSource();
	
	//블럭초기화 : dataSource 초기화
	{
		this.dataSource.setDriverClassName(properties.getProperty("driver"));	//driver loading
		this.dataSource.setUrl(properties.getProperty("url"));
		this.dataSource.setUsername(properties.getProperty("username"));
		this.dataSource.setPassword(properties.getProperty("password"));
		
		//총 10개 -> 2개씩 커낵션을 사용-> 2개씩 하다가 만약 10개를 다쓰면 다쓴 커낵션이 나올때까지 대기
		this.dataSource.setInitialSize(10);//총 커낵션 갯수 설정 
		this.dataSource.setMaxIdle(2);	//대기중인 커낵션 갯수 
	}
	
	public Connection getConnection() throws SQLException {
		Connection con = this.dataSource.getConnection();
		return con;
	}
	
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
