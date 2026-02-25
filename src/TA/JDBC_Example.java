package TA;
import java.sql.*;

public class JDBC_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // is a static method of the Class class used to load a class dynamically at runtime.
				   
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/assignments", "root", "Lohi@2004");
			 
			Statement stmt=con.createStatement();
			
//			String query = "CREATE TABLE student(" +
//                    "Roll_no INT PRIMARY KEY," +
//                    "Name VARCHAR(50)," +
//                    "Email VARCHAR(50)," +
//                    "age INT)";
//			 String insertQuery =
//	                    "INSERT INTO student VALUES (1,'Rahul','rahul@gmail.com',21)";
//			 String insertQuery ="INSERT INTO student VALUES(2,'Anita','anita@gmail.com',22),"+"(3,'Kiran','kiran@gmail.com',20)";
//
//	            stmt.executeUpdate(insertQuery);
//
//	            System.out.println("Data inserted successfully");

			ResultSet rs=stmt.executeQuery(" select * from student");
//			stmt.executeUpdate(query);
			System.out.println("Roll_no   Name   Email   Age");
			 
			while (rs.next())
			{
//				System.out.println(rs.getInt("Roll_no") + " " + rs.getString("Name")+" "+rs.getString("Email")+" "+rs.getInt("age"));
				int roll = rs.getInt("Roll_no");
			    String name = rs.getString("Name");
			    String email = rs.getString("Email");
			    int age = rs.getInt("age");

			    System.out.println(roll + " " + name + " " + email + " " + age);
				
			}
			con.close();
			}
				catch (Exception e)
			   {
					System.out.println(e);
			   }

	}

}
