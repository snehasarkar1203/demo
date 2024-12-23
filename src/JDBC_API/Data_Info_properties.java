package JDBC_API;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Data_Info_properties {
	String class_path1, database_url1, database_name1, username1, password1;
	Connection connect = null;
	Statement statement = null;
	String query = null;
	int r = 0;

	public Data_Info_properties() {
		readDataInfo();
	doConnection();
	insertData();
		//deleteData();
		//updateData();
		//fetchData();
	}
public void fetchData() {
	try {
	statement = connect.createStatement();
	query = "select * from employee";
	r = statement.executeUpdate(query);
	System.out.println("R-> " + r);  // R->no. of rows
	statement.close();
	connect.close();
	System.out.println("data fetched......");
}catch (SQLException e) {
	System.out.println(e);
}
}
   public void updateData() {
	   try {
	   statement = connect.createStatement();
		query = "update employee set age=23 where name='rahul'";
		r = statement.executeUpdate(query);
		System.out.println("R-> " + r);  // R->no. of rows
		statement.close();
		connect.close();
		System.out.println("data updated.....");
	} catch (SQLException e) {
		System.out.println(e);
	}
   }
	public void deleteData() {
		try {
		statement = connect.createStatement();
		query = "delete from employee where name='kushi'";
		r = statement.executeUpdate(query);
		System.out.println("R-> " + r);  // R->no. of rows
		statement.close();
		connect.close();
		System.out.println("data deletion done.....");
	} catch (SQLException e) {
		System.out.println(e);
	}
	}
	public void insertData() {
		try {
			statement = connect.createStatement();
			query = "insert into employee values(301,'rahul',56)";
			r = statement.executeUpdate(query);
			System.out.println("R-> " + r);  // R->no. of rows
			statement.close();
			connect.close();
			System.out.println("data inserted.....");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	public void doConnection() {
		try {
			Class.forName(class_path1);
			connect = DriverManager.getConnection(database_url1 + database_name1, username1, password1);
			System.out.println("connection is done....");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void readDataInfo() {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("data_info.properties");
			prop.load(fis);
			class_path1 = prop.getProperty("class_path");
			System.out.println("class path -> " + class_path1);
			database_url1 = prop.getProperty("database_url");
			System.out.println("database url -> " + database_url1);
			database_name1 = prop.getProperty("database_name");
			System.out.println("databse name -> " + database_name1);
			username1 = prop.getProperty("username");
			System.out.println("user name -> " + username1);
			password1 = prop.getProperty("password");
			System.out.println("password -> " + password1);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Data_Info_properties i = new Data_Info_properties();
	}
}
