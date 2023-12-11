package insertRecord;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertrecordjdbc {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merabd", "root", "root");
		
		Statement stmt= con.createStatement();
		
		String sql = "insert into employees value(1,'Jhon','Doe',30)"; 
		
		int a = stmt.executeUpdate(sql);
		
		System.out.println("Sucessfully added employee "+ a);
		con.close();
	}

}
