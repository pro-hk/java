package selfJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2 {
	static final String driver = "oracle.jdbc.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String id = "tis002";
	static final String pw = "1234";
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	
	public static void deleteData() {
		try {s
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			String sql = "delete from newmember where no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 3);
			int result = pstmt.executeUpdate();
			if(result > 0) System.out.println("삭제되었습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	public static void updateData() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			String sql = "update newmember set name = ? where no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "jang");
			pstmt.setInt(2, 2);
			int result = pstmt.executeUpdate();
			if (result > 0 ) System.out.println("업데이트되었습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void insertData() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			String sql = "insert into newmember values (seq_newmember.nextval,?,?,?,?,?,sysdate)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "jang");
			pstmt.setString(2, "hyeok");
			pstmt.setString(3, "janghyeok");
			pstmt.setString(4, "jang@naver.com");
			pstmt.setString(5, "010-1111-1111");
			int result = pstmt.executeUpdate();
			if(result > 0) System.out.println("삽입 되었습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void getData() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from newmember");
			while(rs.next()) {
				int no = rs.getInt("no");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String hp = rs.getString("hp");
				String regdate = rs.getString("regdate");
				System.out.println("no : "+no+"  id : "+id+"  pw : "+pw+"  name : "+name+
						"  email : "+email+"  hp : "+hp+"  regdate : "+regdate);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(rs!=null) rs.close();
					if(stmt!=null) stmt.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	public static void main(String[] args) {
//		insertData();
//		getData();
//		updateData();
		deleteData();
		getData();
	}
}
