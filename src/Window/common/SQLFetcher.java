	
package Window.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.JTextField;


public class SQLFetcher {
	
	 static int count;
	public static StringBuilder query1(JTextField textField) throws Exception {
		StringBuilder sb2 = new StringBuilder();
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		String txt = textField.getText();
		String _url = "jdbc:mysql://localhost/JdbcLab?autoReconnect=true&useSSL=false";

		try {

			// Step 1: Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2: make a connection
			conn = DriverManager.getConnection(_url, "root", "root");

			// Step 3: Create a statement
			stmt = conn.createStatement();

			// Step 4: Make a query
			rs = stmt.executeQuery(txt);

			// Step 5: Use ResultSetMetaData to discover the size of the returned relation
			ResultSetMetaData metaData = rs.getMetaData();

			// Step 5.1: Get the column header info for report writing
			int numColumns = metaData.getColumnCount();

			for (int i = 1; i <= numColumns; i++) {
				sb2.append(String.format(" %-10s", metaData.getColumnLabel(i)));
				System.out.print(String.format(" %-10s", metaData.getColumnLabel(i)));
			}
			System.out.println("");
			sb2.append("\n");
			// Step 6: Print out the results

			while (rs.next()) {
				for (int i = 1; i <= numColumns; i++) {
					Object obj = rs.getObject(i);
					if (obj != null) {
						sb2.append(String.format(" %-10s", rs.getObject(i).toString()));
						System.out.print(String.format(" %-10s", rs.getObject(i).toString()));
					} else {

						sb2.append(String.format(" %-10s", "NULL"));
						System.out.print(String.format(" %-10s", "NULL"));
					}
				}
				System.out.println("");
				sb2.append("\n");
			}

		} catch (Exception exc) {
			exc.printStackTrace();
		} finally { // ALWAYS clean up your DB resources
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return sb2;

	}

	public static String queryusername(JTextField username) throws Exception {
		String sb = null;
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		String txt = username.getText();
		String _url = "jdbc:mysql://localhost/JdbcLab?autoReconnect=true&useSSL=false";

		try {

			// Step 1: Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2: make a connection
			conn = DriverManager.getConnection(_url, "root", "root");

			// Step 3: Create a statement
			stmt = conn.createStatement();

			// Step 4: Make a query
			rs = stmt.executeQuery("Select Username from user_account where user_account.Username = '" + txt + "'");

			// Step 5: Use ResultSetMetaData to discover the size of the returned relation
			ResultSetMetaData metaData = rs.getMetaData();

			// Step 5.1: Get the column header info for report writing
			

			while (rs.next()) {

				sb = rs.getString("Username");
				System.out.println(sb);

			}

		} catch (Exception exc) {
			exc.printStackTrace();
		} finally { // ALWAYS clean up your DB resources
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return sb;

	}
	public static String querylocation(JTextField location) throws Exception {
		String sb = null;
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		String txt = location.getText();
		String _url = "jdbc:mysql://localhost/JdbcLab?autoReconnect=true&useSSL=false";

		try {

			// Step 1: Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2: make a connection
			conn = DriverManager.getConnection(_url, "root", "root");

			// Step 3: Create a statement
			stmt = conn.createStatement();

			// Step 4: Make a query
			rs = stmt.executeQuery("Select Location from user_account where user_account.Username = '" + txt + "'");

			// Step 5: Use ResultSetMetaData to discover the size of the returned relation
			ResultSetMetaData metaData = rs.getMetaData();

			// Step 5.1: Get the column header info for report writing
			

			while (rs.next()) {

				sb = rs.getString("Location");
				System.out.println(sb);

			}

		} catch (Exception exc) {
			exc.printStackTrace();
		} finally { // ALWAYS clean up your DB resources
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return sb;

	}
	public static String queryemail(JTextField email) throws Exception {
		String sb = null;
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		String txt = email.getText();
		String _url = "jdbc:mysql://localhost/JdbcLab?autoReconnect=true&useSSL=false";

		try {

			// Step 1: Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2: make a connection
			conn = DriverManager.getConnection(_url, "root", "root");

			// Step 3: Create a statement
			stmt = conn.createStatement();

			// Step 4: Make a query
			rs = stmt.executeQuery("Select Email_Address from user_account where user_account.Username = '" + txt + "'");

			// Step 5: Use ResultSetMetaData to discover the size of the returned relation
			ResultSetMetaData metaData = rs.getMetaData();

			// Step 5.1: Get the column header info for report writing
			

			while (rs.next()) {

				sb = rs.getString("Email_Address");
				System.out.println(sb);

			}

		} catch (Exception exc) {
			exc.printStackTrace();
		} finally { // ALWAYS clean up your DB resources
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return sb;

	}
	public static String queryname(JTextField name) throws Exception {
		String sb = null;
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		String txt = name.getText();
		String _url = "jdbc:mysql://localhost/JdbcLab?autoReconnect=true&useSSL=false";

		try {

			// Step 1: Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2: make a connection
			conn = DriverManager.getConnection(_url, "root", "root");

			// Step 3: Create a statement
			stmt = conn.createStatement();

			// Step 4: Make a query
			rs = stmt.executeQuery("Select Name from user_account where user_account.Username = '" + txt + "'");

			// Step 5: Use ResultSetMetaData to discover the size of the returned relation
			ResultSetMetaData metaData = rs.getMetaData();

			// Step 5.1: Get the column header info for report writing
			

			while (rs.next()) {

				sb = rs.getString("Name");
				System.out.println(sb);

			}

		} catch (Exception exc) {
			exc.printStackTrace();
		} finally { // ALWAYS clean up your DB resources
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return sb;

	}	public static String querybirthdate(JTextField birthdate) throws Exception {
		String sb = null;
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		String txt = birthdate.getText();
		String _url = "jdbc:mysql://localhost/JdbcLab?autoReconnect=true&useSSL=false";

		try {

			// Step 1: Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2: make a connection
			conn = DriverManager.getConnection(_url, "root", "root");

			// Step 3: Create a statement
			stmt = conn.createStatement();

			// Step 4: Make a query
			rs = stmt.executeQuery("Select Birthdate from user_account where user_account.Username = '" + txt + "'");

			// Step 5: Use ResultSetMetaData to discover the size of the returned relation
			ResultSetMetaData metaData = rs.getMetaData();

			// Step 5.1: Get the column header info for report writing
			

			while (rs.next()) {

				sb = rs.getString("Birthdate");
				System.out.println(sb);

			}

		} catch (Exception exc) {
			exc.printStackTrace();
		} finally { // ALWAYS clean up your DB resources
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return sb;

	}


	public static void query3(JTextField uName, JTextField location, JTextField email, JTextField name,
			JTextField password, JTextField birthdate) throws ClassNotFoundException {
	
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		String txt1 = uName.getText();
		String txt2 = location.getText();
		String txt3 = email.getText();
		int txt4 = Integer.parseInt(password.getText());
		String txt5 = name.getText();
		String txt6 = birthdate.getText();
		

		System.out.println(txt1 + " username");
		System.out.println(txt2 + " location");
		System.out.println(txt3 + " email");
		System.out.println(txt4 + " passw");
		System.out.println(txt5 + " name");
		System.out.println(txt6 + " birthdate");
		String _url = "jdbc:mysql://localhost/JdbcLab?autoReconnect=true&useSSL=false";

		try {

			// Step 1: Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2: make a connection
			conn = DriverManager.getConnection(_url, "root", "root");

			// Step 3: Create a statement
			stmt = conn.createStatement();
			String query = " insert into user_account (Username, Location, Email_Address, Password, Name, Birthdate)"
					+ " values (?, ?, ?, ?, ?,?)";
			
			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setString(1, txt1);
			preparedStmt.setString(2, txt2);
			preparedStmt.setString(3, txt3);
			preparedStmt.setInt(4, txt4);
			preparedStmt.setString(5, txt5);
			preparedStmt.setString(6, txt6);

			// execute the preparedstatement
			preparedStmt.execute();

			

		} catch (SQLException se) {
			se.printStackTrace();
		} finally { // ALWAYS clean up your DB resources
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		

	}

	public static String query4() throws Exception {
	
		String sb = "";
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;

		String _url = "jdbc:mysql://localhost/JdbcLab?autoReconnect=true&useSSL=false";

		try {

			// Step 1: Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2: make a connection
			conn = DriverManager.getConnection(_url, "root", "root");

			// Step 3: Create a statement
			stmt = conn.createStatement();

			// Step 4: Make a query
			rs = stmt.executeQuery("Select Username from user_account");

			// Step 5: Use ResultSetMetaData to discover the size of the returned relation
			ResultSetMetaData metaData = rs.getMetaData();

			// Step 5.1: Get the column header info for report writing
			int numColumns = metaData.getColumnCount();


			while (rs.next()) {
				
    
				String firstName = rs.getString("Username");
				System.out.format("%s\n", firstName);
				sb = sb + firstName+"\n";
			
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally { // ALWAYS clean up your DB resources
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return sb;
          
	}
	public static int queryint() throws Exception {
		
		String sb = null;
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
int counter = 0;
		String _url = "jdbc:mysql://localhost/JdbcLab?autoReconnect=true&useSSL=false";

		try {

			// Step 1: Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2: make a connection
			conn = DriverManager.getConnection(_url, "root", "root");

			// Step 3: Create a statement
			stmt = conn.createStatement();

			// Step 4: Make a query
			rs = stmt.executeQuery("Select Username from user_account");

			// Step 5: Use ResultSetMetaData to discover the size of the returned relation
			ResultSetMetaData metaData = rs.getMetaData();

			// Step 5.1: Get the column header info for report writing
			int numColumns = metaData.getColumnCount();


			while (rs.next()) {
				count ++;

			}
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally { // ALWAYS clean up your DB resources
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return counter;
	}

}
