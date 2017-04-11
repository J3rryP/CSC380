


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBManager {

	final String DB_URL="jdbc:mysql://localhost:3306/p2p_library";
    final String USER = "root";
    final String PASS = "raspberry888.";
	
	public DBManager(){
		
	}
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			return con;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	public ResultSet executeQuery(String sql) throws SQLException {

		Connection con = getConnection();
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery(sql);

		smt.close();
		con.close();

		return rs;
	}

	/*public static void main(String[] args) throws Exception {

		ResultSet rs = executeQuery("select * from video");

		while (rs.next()) {
			String title = rs.getString("title");
			int price = rs.getInt("price");
			System.out.println("title=" + title + ",price=" + price);
		}
	}*/
}
