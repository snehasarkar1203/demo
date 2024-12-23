package JDBC_API;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Step_7 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("step 1 -> load driver class done....");
			Connection connect=DriverManager.getConnection("jdbc:mySQL://localhost:3306/batch_954","root","root");
			System.out.println("step 2 -> Establish connection....");
		    Statement statement=connect.createStatement();
			System.out.println("step 3 -> statement created...");
			String query="select * from student";
			System.out.println("step 4 -> prepare sql statement...");
			ResultSet result=statement.executeQuery(query);
			System.out.println("step 5 -> submit query");
			while(result.next()) {
				System.out.println(result.getInt(1)+","+result.getString(2));
			}
			System.out.println("step 6 -> process the result");
			statement.close();
			connect.close();
			System.out.println("step 7 -> release the resources");
			}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}
