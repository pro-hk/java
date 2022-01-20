import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC01 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try { // sql로 import
			Class.forName("oracle.jdbc.OracleDriver"); // 오라클 연결 경로.. 드라이버 찾기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger"); // 연결
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
}