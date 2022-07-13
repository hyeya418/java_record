package jdbc.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbc.DB;

//DAO (Data Access Object)
public class MemberDAO {
	//회원정보 삭제 기능 메서드
	public static int memberDelete(String userid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rows = 0;
		try {//입출력, 네트워크, DB관련은 필수 예외처리해줘야 함
			conn = DB.oraConn();
			String sql = "delete from member where userid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rows = pstmt.executeUpdate(); //insert문, update문에서 사용
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return rows;
	}
}
