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
		String sql = "select *  from ��"; // �÷����� �� ���°��� ����

		// 4. statement(prepare statement, statement)
		Statement stmt = con.createStatement();

		List<MemberVO> memberList = null;
		try {
			// 5. ��������(select -> ResultSet-> excuteQuery : �������� �޶����� �Լ��鵵 �޶���)
			ResultSet rs = stmt.executeQuery(sql);

			// 6. ��üȭ : result�� vo�� ���
			memberList = new ArrayList<MemberVO>();
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

		member1.set�����̵�("mimi");
		member1.set���̸�("������");
		member1.set����(26);
		member1.set���("gold");
		member1.set������(5690);
		String sql = "insert into ��(�����̵�,���̸�,����,����,������,���)" + " values(?,?,?,?,?,?)"; // values �� ���� �ʼ�

		// 4. preparedstatement -> �ξ� ����, ��������
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, member1.get�����̵�());
		stmt.setString(2, member1.get���̸�());
		stmt.setInt(3, member1.get����());
		stmt.setString(4, member1.get����());
		stmt.setInt(5, member1.get������());
		stmt.setString(6, member1.get���());

		try {
			stmt.executeUpdate();
		} finally { // exception�� ������� ������ ����
			if (con != null)
				con.close();
		}
	}

}
