import java.sql.*;

public class Tester {
	public static void main(String[] args) {

		String server = "jdbc:mysql://140.119.19.73:3315/";
		String database = "110209003"; // change to your own database
		String url = server + database + "?useSSL=false";
		String username = "110209003"; // change to your own user name
		String password = "wiega"; // change to your own password		
		
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("DB Connectd");
			// Task 1 //
			Statement stat = conn.createStatement();
			System.out.println("Query 1:");
			String query = "SELECT ID, Name, Birth, Position FROM Twice WHERE Position = \"Vocal\"";
			boolean hasResultSet = stat.execute(query);
			if (hasResultSet) {
				ResultSet result = stat.getResultSet();
				showResultSet(result);
				result.close();
			}
			System.out.println("-".repeat(80));

			// Task 2 //		
			String cmd = "INSERT INTO Twice (ID,Name,Birth,Height,Position) VALUES (10,'Shihyu', '1999-01-11', 163.78, 'ACE')";
			stat.execute(cmd);
			
			// Task 3 //
			System.out.println("Query 2:");
			query = "SELECT * FROM Twice WHERE Birth > '1999-01-01'";
			hasResultSet = stat.execute(query);
			if (hasResultSet) {
				ResultSet result = stat.getResultSet();
				showResultSet(result);
				result.close();
			}
			System.out.println("-".repeat(80));
			
			
			// Task 4 //		
			cmd = "DELETE FROM Twice WHERE NAME='Shihyu'";
			stat.execute(cmd);
			
			// Task 5 //
			System.out.println("Query 3:");
			query = "SELECT ID, Name, Height FROM Twice WHERE Height between 161 and 165";
			hasResultSet = stat.execute(query);
			if (hasResultSet) {
				ResultSet result = stat.getResultSet();
				showResultSet(result);
				result.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	// define this static method in your Tester class
	public static void showResultSet(ResultSet result) throws SQLException {
		
		ResultSetMetaData metaData = result.getMetaData();
		int columnCount = metaData.getColumnCount();
		
		for (int i = 1; i <= columnCount; i++) {			
			System.out.printf("%15s", metaData.getColumnLabel(i));
		}
		System.out.println();
		
		while (result.next()) {
			for (int i = 1; i <= columnCount; i++) {
				System.out.printf("%15s", result.getString(i));
			}
			System.out.println();
		}
	}
}
