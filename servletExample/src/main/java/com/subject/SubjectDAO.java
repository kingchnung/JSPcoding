package com.subject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.common.DBUtil.getConnection;

public class SubjectDAO {
	private static SubjectDAO instance = null;

	public static SubjectDAO getInstance() {
		if (instance == null) {
			instance = new SubjectDAO();
		}

		return instance;
	}

	private SubjectDAO() {
	}

	private SubjectVO addSubject(ResultSet rs) throws SQLException {
		SubjectVO subjectVO = new SubjectVO();
		subjectVO.setNo(rs.getInt("no"));
		subjectVO.setSubjectNumber(rs.getString("s_num"));
		subjectVO.setSubjectName(rs.getString("s_name"));

		return subjectVO;
	}

	public List<SubjectVO> getAllSubjects() {
		List<SubjectVO> list = new ArrayList<>();
		String sql = "SELECT no, s_num, s_name FROM subject ORDER BY no";

		try (Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {

			while (rs.next()) {
				list.add(addSubject(rs));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

		return list;
	}

	public String getSubjectNumber() {
		String subjectNumber = "";

		StringBuilder sql = new StringBuilder();
		sql.append("SELECT NVL(TO_CHAR(MAX(s_num)+1, 'FM00'), '01') ");
		sql.append("AS subjectNum FROM subject");

		try (Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				ResultSet rs = pstmt.executeQuery();) {
			
			if(rs.next()) {
				subjectNumber = rs.getString("subjectNum");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return subjectNumber;
	}
	
	public boolean subjectInsert(SubjectVO subjectVO) {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO subject(no, s_num, s_name) ");
		sql.append("VALUES(subject_seq.nextval, ?, ?) ");
		
		try (Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			
			pstmt.setString(1, subjectVO.getSubjectNumber());
			pstmt.setString(2, subjectVO.getSubjectName());
			
			return pstmt.executeUpdate() == 1;
		}catch(SQLException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
			return false;
		}catch(Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	public boolean subjectUpdate(SubjectVO subjectVO) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE subject SET s_name = ? ");
		sql.append("WHERE s_num = ? ");
		
		try(Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			pstmt.setString(1, subjectVO.getSubjectName());
			pstmt.setString(2, subjectVO.getSubjectNumber());
			
			return pstmt.executeUpdate() == 1;
		}catch(SQLException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
			return false;
		}catch(Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
			return false;
		}
	}
}
