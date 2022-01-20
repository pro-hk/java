package selfJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class JDBC {
	//C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
	// 시작 전에 bulid path 설정
	static final String driver = "oracle.jdbc.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String id = "tis";
	static final String pw = "1234";
	
	private static void selectOne() {
		// id 입력받아서 1개만 출력하기
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("검색할 ID를 입력하시오");
		int _id = scanner.nextInt();
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			String sql = "select * from member where id = "+_id;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String hp = rs.getString("hp");
				String regdate = rs.getString("regdate");
				System.out.println("id : "+id+"  name : "+name+"  email : "+email+"  hp : "+hp+"  regdate : "+regdate);
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
	
	private static void updateData() {
		// 수정할 ID 입력받기
		// 이름 바꾸기
		// 이메일 바꾸기
		// hp 바꾸기
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("수정할 ID를 입력하세요");
		int _id =  scanner.nextInt();
		System.out.println("수정할 name을 입력하세요");
		String _name =  scanner.nextLine();
		System.out.println("수정할 email을 입력하세요");
		String _email =  scanner.nextLine();
		System.out.println("수정할 전화번호를 입력하세요");
		String _hp =  scanner.nextLine();
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			String sql = "update member set name = ?, email = ?, hp = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, _name);
			pstmt.setString(2, _email);
			pstmt.setString(3, _hp);
			pstmt.setInt(4, _id);
			int result = pstmt.executeUpdate();
			if (result > 0)	System.out.println(_id+"님을 수정하였습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void deleteData() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 아이디를 입력하시오");
		int _id = scanner.nextInt();
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			String sql = "delete from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, _id);
			int result = pstmt.executeUpdate();
			if(result > 0 ) System.out.println(_id+"님이 삭제되었습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	private static void getData() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			String sql = "select * from member order by id desc";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String hp = rs.getString("hp");
				String regdate = rs.getString("regdate");
				System.out.println(
						"id : "+id+"  name : "+name+"  email : "+email+"  hp : "+hp+"  regdate : "+regdate);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결실패");
		} finally {
				try {
					if(rs != null) rs.close();
					if(stmt != null) stmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	private static void insertData() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("name을 입력하세요");
		String _name =  scanner.nextLine();
		System.out.println("email을 입력하세요");
		String _email =  scanner.nextLine();
		System.out.println("전화번호를 입력하세요");
		String _hp =  scanner.nextLine();
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("연결");
			String sql = "insert into member values(SEQ_MEMBER.nextval,?,?,?,sysdate)";
			pstmt = conn.prepareStatement(sql);
			// ? 순서와 개수..
			pstmt.setString(1, _name);
			pstmt.setString(2, _email);
			pstmt.setString(3, _hp);
			int result = pstmt.executeUpdate();
			if(result > 0) System.out.println("입력되었습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean off = false;
		
		while(true) {
			System.out.println("0 : 종료, 1 : 모든 member 조회, 2 : 원하는 member 조회, 3 : 삭제, 4: 입력, 5: 수정");
			int sel = scanner.nextInt();
			switch(sel) {
				case 0 : 
					off = true;
					break;
				case 1 : 
					getData();
					break;
				case 2 : 
					selectOne();;
					break;
				case 3 : 
					deleteData();
					break;
				case 4 : 
					insertData();
					break;
				case 5 : 
					updateData();
					break;
			}
			if(off) break;
		}
	}
}
