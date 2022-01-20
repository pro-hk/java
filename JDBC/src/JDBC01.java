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
		try { // sql�� import
			Class.forName("oracle.jdbc.OracleDriver"); // ����Ŭ ���� ���.. ����̹� ã��
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger"); // ����
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
}