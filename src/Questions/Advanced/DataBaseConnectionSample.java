package Questions.Advanced;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectionSample {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con =DriverManager.getConnection("jdbc:sql://localhost/url","root","");
		Statement st =con.createStatement();
		
		ResultSet rs=st.executeQuery("");
		while(rs.next()) {
			System.out.println(rs.getString(""));
		}
	}
}
