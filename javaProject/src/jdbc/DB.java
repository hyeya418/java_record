package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {

	public static Connection oraConn() {
		Connection conn = null;
		try {
			FileInputStream fis = new FileInputStream("c:\\driver\\oracle.prop");
			Properties prop = new Properties();
			//properties ==> key, value로 파일의 특정문장을 분리해서 값을 저장
			prop.load(fis);
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String password = prop.getProperty("password");
			//DB접속
			conn = DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
