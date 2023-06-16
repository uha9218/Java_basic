package com.java.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;	//�� ������ �ҽ��� Ȱ��
//connection�� �� db�� �����ϵ� �׿��� ���� �ٸ�������� �������
public class DBCP2JDBCDataSource extends AbstractMyDataSource{
	
	//�̱���
	private static DBCP2JDBCDataSource instance = new DBCP2JDBCDataSource();
	private DBCP2JDBCDataSource() {}
	public static DBCP2JDBCDataSource getInstance() {
		return instance;
	}
	
	
	
	//JDBCDataSource�̱��� ������ JDBCDataSour�� private�̶�  extends �Ұ�!
	private BasicDataSource dataSource = new BasicDataSource();
	
	//���ʱ�ȭ : dataSource �ʱ�ȭ
	{
		this.dataSource.setDriverClassName(properties.getProperty("driver"));	//driver loading
		this.dataSource.setUrl(properties.getProperty("url"));
		this.dataSource.setUsername(properties.getProperty("username"));
		this.dataSource.setPassword(properties.getProperty("password"));
		
		//�� 10�� -> 2���� Ŀ������ ���-> 2���� �ϴٰ� ���� 10���� �پ��� �پ� Ŀ������ ���ö����� ���
		this.dataSource.setInitialSize(10);//�� Ŀ���� ���� ���� 
		this.dataSource.setMaxIdle(2);	//������� Ŀ���� ���� 
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
