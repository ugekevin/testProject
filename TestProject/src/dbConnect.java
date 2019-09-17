import java.sql.*;

public class  dbConnect{

	public static Connection getConnect() {
		
		Connection con = null;
		

				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost/DBT1" + "?useLegacyDatetimeCode=false&serverTimezone=UTC", "jochen", "test");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		return con;
			
	}
}