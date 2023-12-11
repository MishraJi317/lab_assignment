
//importing all classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Code {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		
		//creating object of scanner
		Scanner sc = new Scanner(System.in);
		
		//taking choice from user for which action he/she needs to perform
		System.out.println("Enter what action you want to perform " );
		System.out.println("I - for Inserting new Record ");
		System.out.println("S - for Displaying data");
		System.out.println("U - for Updating Data ");
		System.out.println("D - for Deleting Data");
		String choice = sc.next();
		
		
		//initializing a connection from mysql
		Class.forName("com.mysql.cj.jdbc.Driver");
		//creating object of mysql driver
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merabd", "root", "root");

		
		//using preparedstatements for firing parameterized queries
		
		//query for inserting data in the table
		PreparedStatement insert= con.prepareStatement("INSERT INTO Product VALUES(?,?)");
		
		//query for updating data in the table
		PreparedStatement update = con.prepareStatement("Update Product Set name = ? WHERE id = ?");
		
		//query for deleting data in the table
		PreparedStatement delete = con.prepareStatement("DELETE FROM Product WHERE id = ?");
		
		//query for displaying data in the table
		PreparedStatement select = con.prepareStatement("SELECT * from product where id = ?");
			
		
		//switch case for differentiating between which query needs to be fired
		switch(choice)
		{
		case "I":
			
			//taking inputs from user
			System.out.println("Enter id for the product : ");
			String id = sc.next();
			System.out.println("Enter Name of the product : ");
			String name = sc.next();	
			
			//mapping inputs in the query
			insert.setString(1, id);
			insert.setString(2, name);	
			
			//executing query
			int i = insert.executeUpdate();
			System.out.println(i+" Record added successfully");
			break;
			
		case "S":
			
			System.out.println("Enter id for the product : ");
			String id1 = sc.next();
			select.setString(1, id1);
			int s = insert.executeUpdate();
			System.out.println(s+" The recordes are ");
			break;
			
		case "U":
			System.out.println("Enter id for the product : ");
			String id2 = sc.next();
			System.out.println("Enter Name that you want to change to: ");
			String name2 = sc.next();
			update.setString(1, name2);
			update.setString(2, id2);
			int u = insert.executeUpdate();
			System.out.println(u+" Record Updated successfully");
			break;
			
		case "D":
			System.out.println("Enter id for the product that you want to delete : ");
			String id3 = sc.next();
			delete.setString(1, id3);
			int d = delete.executeUpdate();
			System.out.println(d+" Record Deleted successfully");
			break;
		}
		
        //closing the connection
		con.close();
		
		
	}

}

