package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestOracleConnection {
	private Connection con;
	{
		try {
		String driver = "oracle.jdbc.driver.OracleDriver";
		// String url = "jdbc:oracle:thin:@������:��Ʈ:SID";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String username = "java";
		String password = "java";

		// 1. driver loading -> driverManager�� ����
		Class.forName(driver);

		// 2.(driverManager�κ���) get connection
		// �� ������� �ʴ¹�� => �ַ� �׽�Ʈ�ÿ��� ���(1ȸ��)
		// -> connection�� ��û�� �����Ǵµ� ���� Ƚ�� �Ѿ�� ����
		// -> �� Ŭ���������� ��밡��
		// -> ������ �Ұ���

		this.con = DriverManager.getConnection(url, username, password);}
		catch(Exception e) {e.printStackTrace();}

	}
	public static void main(String[] args) throws Exception {
		TestOracleConnection main = new TestOracleConnection();
		//main.selectSQL();
		main.insertSQL();
	}
	
	public void insertSQL() throws Exception{
		MemberVO member = new MemberVO();
		
		member.set�����̵�("mimi");
		member.set���̸�("������");
		member.set����(26);
		member.set���("gold");
		member.set������(5690);
		
//		// 3. SQL
//		String sql = "insert into ��(�����̵�,���̸�,����,���,����,������)"
//					+" values('"+member.get�����̵�()+"','"
//					+member.get���̸�()+"',"
//					+member.get����()+",'"
//					+member.get���()+"','"
//					+member.get����()+"',"
//					+member.get������()+")";
//		
//		// 4. statement(prepare statement, statement)
//		Statement stmt = con.createStatement();
//		
//		con.setAutoCommit(false);
//		
//		stmt.executeUpdate(sql);
//		
		
		// 3.SQL 
		String sql = "insert into ��(�����̵�,���̸�,����,����,������,���)" + " values(?,?,?,?,?,?)";	//values �� ���� �ʼ�
		
		//4. preparedstatement -> �ξ� ����, �������� 
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, member.get�����̵�());
		stmt.setString(2, member.get���̸�());
		stmt.setInt(3, member.get����());
		stmt.setString(4, member.get����());
		stmt.setInt(5, member.get������());
		stmt.setString(6, member.get���());
		
		con.setAutoCommit(false);
		
		stmt.executeUpdate();
		
		selectSQL();
		
		con.rollback();
		
		if (con != null) con.close();
	}

	public void selectSQL() throws Exception {
		// 3. SQL
		String sql = "select *  from ��"; // �÷����� �� ���°��� ����

		// 4. statement(prepare statement, statement)
		Statement stmt = con.createStatement();

		// 5. ��������(select -> ResultSet-> excuteQuery : �������� �޶����� �Լ��鵵 �޶���)
		ResultSet rs = stmt.executeQuery(sql);

		// 6. ��üȭ : result�� vo�� ���
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		while (rs.next()) { // ���� ���� ������ false��ȯ
			MemberVO member = new MemberVO();
			member.set�����̵�(rs.getString("�����̵�"));
			member.set���̸�(rs.getString("���̸�"));
			member.set����(rs.getInt("����"));
			member.set���(rs.getString("���"));
			member.set������(rs.getInt("������"));
			member.set����(rs.getString("����"));

			memberList.add(member);

		}

		System.out.println(memberList); // �ּҰ� ��� -> toString overriding �ʿ�

		// 7. connection close
		if (con != null) {}
			//con.close();
		
	}

}
