package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Program2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String title ="Test2";
		String writerId = "newlec";
		String content = "hahaha";
		String files ="";
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String sql = "INSERT INTO NOTICE(TITLE, WRITER_ID, CONTENT, FILES) VALUES(?,?,?,?)";
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"newlec", "1234");
		//Statement st = con.createStatement();
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, title);
		st.setString(2, writerId);
		st.setString(3, content);
		st.setString(4, files);
		int rs = st.executeUpdate();
		
		
			System.out.println(rs);
	
		
	
		st.close();
		con.close();

	}

}
