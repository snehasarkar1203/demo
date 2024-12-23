package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
   private String name;
   private int age;
   private static ArrayList student_List=new ArrayList();
    Student arr[]=new Student[5];
	
	    public Student() {
    	
    }
    public Student(String name,int age) {
    	this.age=(age);
    	this.name=(name);
    	student_List.add(this);
    }
    public static void pringtStudentList() {
    	System.out.println("student list");
    	Iterator itr=student_List.iterator();
    	while(itr.hasNext()) {
    		Object o=itr.next();
    		Student st=(Student)(o);
    		System.out.println("name="+st.getName());
    		System.out.println("age="+st.getAge());
    	}
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
	
}
