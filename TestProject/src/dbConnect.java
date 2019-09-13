import java.sql.*;

public class  dbConnect{

	public static Connection getConnect() {
		
		Connection con = null;
		

				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root" , "bfwhd");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		return con;
			
	}
}