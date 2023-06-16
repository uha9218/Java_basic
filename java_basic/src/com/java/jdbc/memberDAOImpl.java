package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class memberDAOImpl implements MemberDAO {

	private AbstractMyDataSource dataSource = DBCP2JDBCDataSource.getInstance();

	@Override
	public List<MemberVO> selectMemberList() throws SQLException {

		Connection con = dataSource.getConnection();
		// 3. SQL
		String sql = "select *  from 고객"; // 컬럼명을 다 쓰는것이 좋음

		// 4. statement(prepare statement, statement)
		Statement stmt = con.createStatement();

		List<MemberVO> memberList = null;
		try {
			// 5. 질의전송(select -> ResultSet-> excuteQuery : 쿼리문이 달라지면 함수들도 달라짐)
			ResultSet rs = stmt.executeQuery(sql);

			// 6. 객체화 : result를 vo로 사상
			memberList = new ArrayList<MemberVO>();
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
		} finally {
			// 7. connection close
			if (con != null) {
				con.close();
			}
		}
		return memberList;
	}

	@Override
	public void insertMember(MemberVO member) throws SQLException {

		Connection con = dataSource.getConnection();

		MemberVO member1 = new MemberVO();

		member1.set고객아이디("mimi");
		member1.set고객이름("송유하");
		member1.set나이(26);
		member1.set등급("gold");
		member1.set적립금(5690);
		String sql = "insert into 고객(고객아이디,고객이름,나이,직업,적립금,등급)" + " values(?,?,?,?,?,?)"; // values 앞 공백 필수

		// 4. preparedstatement -> 훨씬 간편, 에러방지
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, member1.get고객아이디());
		stmt.setString(2, member1.get고객이름());
		stmt.setInt(3, member1.get나이());
		stmt.setString(4, member1.get직업());
		stmt.setInt(5, member1.get적립금());
		stmt.setString(6, member1.get등급());

		try {
			stmt.executeUpdate();
		} finally { // exception과 상관없이 무조건 실행
			if (con != null)
				con.close();
		}
	}

}
