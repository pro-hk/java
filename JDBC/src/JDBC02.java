import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC02 {
	static final String driver = "oracle.jdbc.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String id = "scott";
	static final String pw = "tiger";

	private static void insertData() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into emp values (?,?,?,?,?,?,?,?)";
		// 드라이버 찾기
		// 연결하기
		// 질문준비
		// 질문날리기
		// 결과받기
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 8865);
			pstmt.setString(2, "HYEOK01");
			pstmt.setString(3, "STUDENT");
			pstmt.setInt(4, 3456);
			pstmt.setString(5, "2022-01-20");
			pstmt.setInt(6, 2200);
			pstmt.setInt(7, 0);
			pstmt.setInt(8, 40);
			int result = pstmt.executeUpdate(); // 몇 개 행에 영향을 미쳤느냐..
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void getData() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try { // sql로 import
			Class.forName(driver); // 오라클 연결 경로.. 드라이버 찾기
			conn = DriverManager.getConnection(url, id, pw); // 연결
			System.out.println("DB연결");
			stmt = conn.createStatement(); // 질문(sql)준비
			rs = stmt.executeQuery("select * from emp"); // 질문(sql)하기
			if (rs != null) {
				System.out.println("질문 날리고 답변 받기 성공");
			}
			while (rs.next()) { // 몇 개가 나올지 모르니 반복문 실행
				String empNo = rs.getString("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				System.out.println("empNo : " + empNo + "  ename : " + ename + "  job : " + job);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결에러");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		getData();
//		insertData();
	}
}
