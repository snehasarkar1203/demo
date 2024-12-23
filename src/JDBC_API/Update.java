package JDBC_API;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
public static void main(String[] args) {
	String class_path="com.mysql.cj.jdbc.Driver";
	String database_url="jdbc:mySQL://localhost:3306/";
	String database_name="batch_954";
	String username="root";
	String password="root";
	Connection connect=null;
	Statement statement=null;
	String query=null;
	int r=0;
	try {
		Class.forName(class_path);
		connect=DriverManager.getConnection(database_url+database_name,username,password);
		statement=connect.createStatement();
		query="update employee set age=60 where name='poonam'";
		r=statement.executeUpdate(query);
		System.out.println(" R-> "+r);
		statement.close();
		connect.close();
		System.out.println("Data updating is done.....");
	}catch(ClassNotFoundException e) {
		System.out.println(e);
	}catch(SQLException e) {
		System.out.println(e);
	}	
}
}
