package Inheritance;

public class Child_Student_Person extends Parent_Person {
	  String schoolname;
	 public Child_Student_Person(){
	 }
		 public Child_Student_Person( String n,String s) {
			 name=n;
			 schoolname=s;
		 }
		 void study() {
		     System.out.println("person name is"+name);
			 System.out.println("schoolname="+schoolname);
	 }
		 
	 
	 }

