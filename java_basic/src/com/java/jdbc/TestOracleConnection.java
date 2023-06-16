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
		// String url = "jdbc:oracle:thin:@아이피:포트:SID";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String username = "java";
		String password = "java";

		// 1. driver loading -> driverManager를 연동
		Class.forName(driver);

		// 2.(driverManager로부터) get connection
		// 잘 사용하지 않는방법 => 주로 테스트시에만 사용(1회성)
		// -> connection이 요청시 제공되는데 일정 횟수 넘어가면 터짐
		// -> 이 클래스에서만 사용가능
		// -> 변경이 불가능

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
		
		member.set고객아이디("mimi");
		member.set고객이름("송유하");
		member.set나이(26);
		member.set등급("gold");
		member.set적립금(5690);
		
//		// 3. SQL
//		String sql = "insert into 고객(고객아이디,고객이름,나이,등급,직업,적립금)"
//					+" values('"+member.get고객아이디()+"','"
//					+member.get고객이름()+"',"
//					+member.get나이()+",'"
//					+member.get등급()+"','"
//					+member.get직업()+"',"
//					+member.get적립금()+")";
//		
//		// 4. statement(prepare statement, statement)
//		Statement stmt = con.createStatement();
//		
//		con.setAutoCommit(false);
//		
//		stmt.executeUpdate(sql);
//		
		
		// 3.SQL 
		String sql = "insert into 고객(고객아이디,고객이름,나이,직업,적립금,등급)" + " values(?,?,?,?,?,?)";	//values 앞 공백 필수
		
		//4. preparedstatement -> 훨씬 간편, 에러방지 
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, member.get고객아이디());
		stmt.setString(2, member.get고객이름());
		stmt.setInt(3, member.get나이());
		stmt.setString(4, member.get직업());
		stmt.setInt(5, member.get적립금());
		stmt.setString(6, member.get등급());
		
		con.setAutoCommit(false);
		
		stmt.executeUpdate();
		
		selectSQL();
		
		con.rollback();
		
		if (con != null) con.close();
	}

	public void selectSQL() throws Exception {
		// 3. SQL
		String sql = "select *  from 고객"; // 컬럼명을 다 쓰는것이 좋음

		// 4. statement(prepare statement, statement)
		Statement stmt = con.createStatement();

		// 5. 질의전송(select -> ResultSet-> excuteQuery : 쿼리문이 달라지면 함수들도 달라짐)
		ResultSet rs = stmt.executeQuery(sql);

		// 6. 객체화 : result를 vo로 사상
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		while (rs.next()) { // 다음 행이 없으면 false반환
			MemberVO member = new MemberVO();
			member.set고객아이디(rs.getString("고객아이디"));
			member.set고객이름(rs.getString("고객이름"));
			member.set나이(rs.getInt("나이"));
			member.set등급(rs.getString("등급"));
			member.set적립금(rs.getInt("적립금"));
			member.set직업(rs.getString("직업"));

			memberList.add(member);

		}

		System.out.println(memberList); // 주소값 출력 -> toString overriding 필요

		// 7. connection close
		if (con != null) {}
			//con.close();
		
	}

}
