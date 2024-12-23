package JDBC_API;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Prepared_Statement {
	String class_path1, database_url1, database_name1, username1, password1;
	Connection connect = null;
	Statement statement = null;
	PreparedStatement pre_statement = null;
	String query = null;
	int r = 0;
	String name, city, course;
	int id;
	int age;
	ResultSet set = null;

	public Prepared_Statement() {
		//readDataInfo();
		//doConnection();
		//readDataByAge();
		//readData();
		acceptValue();
		//enterData();
		//insertData();
		//updateData();
		//deleteData();
	}
	public void acceptValue() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter student id");
		id = s.nextInt();
		System.out.println("enter student name");
		name = s.next();
		System.out.println("enter student city");
		city = s.next();
		System.out.println("enter student age");
		age = s.nextInt();
		System.out.println("enter student course");
		course = s.next();
	}
	public void readDataByAge() {
		try {
			query="select name,age,city from student where age<=?";
			pre_statement=connect.prepareStatement(query);
			pre_statement.setInt(1, 25);
			set=pre_statement.executeQuery();
			while(set.next()) {
			System.out.println("*********");
			System.out.println("name-> "+set.getString(1));
			System.out.println("age-> "+set.getInt(2));
			System.out.println("city-> "+set.getString(3));
		}
		pre_statement.close();
		connect.close();
		}catch(

	SQLException e)
	{
		System.out.println(e);
	}
}
	public void readData() {
		try {
			query="select * from student";
			pre_statement=connect.prepareStatement(query);
			set=pre_statement.executeQuery();
			while(set.next()) {
			System.out.println("-------------");
			System.out.println("id ->"+set.getInt(1));
			System.out.println("city ->"+set.getString(3));
			System.out.println("name ->"+set.getString(2));
			System.out.println("age ->"+set.getInt(4));
			System.out.println("course ->"+set.getString(5));
		}
		set.close();
		pre_statement.close();
		connect.close();
		}catch(SQLException e)
	{
		System.out.println(e);
	}
}
	public void enterData() {
		try {
			query = "insert into student values(?,?,?,?,?)";
			pre_statement = connect.prepareStatement(query);
			pre_statement.setInt(1, id);
			pre_statement.setString(2, name);
			pre_statement.setString(3, city);
			pre_statement.setInt(4, age);
			pre_statement.setString(5, course);
			r = pre_statement.executeUpdate();
			pre_statement.close();
			connect.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	public void insertData() {
		try {
			statement = connect.createStatement();
			query = "insert into employee values(301,'rahul',56)";
			r = statement.executeUpdate(query);
			System.out.println("R-> " + r); // R->no. of rows
			statement.close();
			connect.close();
			System.out.println("data inserted.....");
		} catch (SQLException e) {
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