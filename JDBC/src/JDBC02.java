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
		// ����̹� ã��
		// �����ϱ�
		// �����غ�
		// ����������
		// ����ޱ�
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
			int result = pstmt.executeUpdate(); // �� �� �࿡ ������ ���ƴ���..
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
		try { // sql�� import
			Class.forName(driver); // ����Ŭ ���� ���.. ����̹� ã��
			conn = DriverManager.getConnection(url, id, pw); // ����
			System.out.println("DB����");
			stmt = conn.createStatement(); // ����(sql)�غ�
			rs = stmt.executeQuery("select * from emp"); // ����(sql)�ϱ�
			if (rs != null) {
				System.out.println("���� ������ �亯 �ޱ� ����");
			}
			while (rs.next()) { // �� ���� ������ �𸣴� �ݺ��� ����
				String empNo = rs.getString("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				System.out.println("empNo : " + empNo + "  ename : " + ename + "  job : " + job);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB���ῡ��");
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
