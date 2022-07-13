package jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberList {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "java";     //오라클 접속id(어제 생성한 user id)
		String pwd = "java1234";//오라클 접속 password
		Connection conn = null;        //DB접속 객체
		PreparedStatement pstmt = null;//sql문 실행시키는 객체
		
		//질의어(query문)의 결과값을 반환시키는 객체 (select문에서만 사용됨)
		ResultSet rs = null; 
		
		try {//입출력, 네트워크, DB관련은 필수 예외처리해줘야 함
			Class.forName(driver);//jdbc 드라이버 로딩(생략가능)
			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("오라클 서버에 접속");
			
			//질의어(query문), select문
			String sql = "select * from member";
			
			pstmt = conn.prepareStatement(sql);//sql문을 실행
			rs = pstmt.executeQuery();//결과값을 리턴받을 수 있도록 실행
			System.out.println("아이디\t이름\t비번");
			
			while(rs.next()) {//다음 레코드(행)가 존재하면 true
				String userid = rs.getString("userid");//()안에 컬럼(열)
				String name = rs.getString("name");
				String passwd = rs.getString("passwd");
				System.out.println(userid+"\t"+name+"\t"+passwd);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {//리소스를 닫을 때는 열 때의 역순으로 닫아야 함.
			try {
				if(rs != null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
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
		
	}//main
}
