package StreamAPI;

import java.util.ArrayList;

public class Student_List implements Comparable<Student_List>{
	private String name;
	private int age;
	private static ArrayList<Student_List>Student_List=new ArrayList<Student_List>();
	  public Student_List() {

	}
	  public Student_List(String name,int age) {
		  this.setName(name);
		  this.setAge(age);
	  }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		}
			@Override
	public String toString() {
		return "Student_List [name=" + name + ", age=" + age + "]";
	}
			@Override
	public int compareTo(Student_List s) {
				if(this.getAge()>s.getAge())
					return -1;
					else if(this.getAge()<s.getAge())
						return 1;
					else
						return 0;
	}
			public static ArrayList<Student_List> getStudent_List() {
				// TODO Auto-generated method stub
				return null;
			}}
