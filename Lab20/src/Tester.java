import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;

public class Tester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String server = "jdbc:mysql://140.119.19.73:3315/";
		String database = "110209003"; // change to your own database
		String url = server + database + "?useSSL=false";
		String username ="110209003"; // change to your own username
		String password = "wiega"; // change to your own password
		
		try {
			Connection conn = DriverManager.getConnection(url, username, password);

			
			DBFrame frame = new DBFrame(conn);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		     
	}
}
