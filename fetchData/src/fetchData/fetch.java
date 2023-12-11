package fetchData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.xdevapi.Result;

public class fetch {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merabd", "root", "root");
		
		Statement stmt= con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from emp");
		int id,salary;
		String name,desig,dept;
		System.out.println("Employee details");
		System.out.println("=================");
		
		while(rs.next())
		{
			id = rs.getInt(1);
			name = rs.getString(2);
			desig = rs.getString(3);
			dept = rs.getString(4);
			salary = rs.getInt(5);
			
			System.out.println(id+" "+name+" "+desig+" "+dept+" "+salary);
		}
		con.close();
	}

}
