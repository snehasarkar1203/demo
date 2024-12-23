package Inheritance;

public class Parent_Person {
	  String name; 
	 public Parent_Person() {
	 }
	 public Parent_Person(String n) {
		 name=n;
	 }
     void introduce() {
    	System.out.println("person name is"+name);
    }
     void setname(String n) {
    	 name=n;
     }
     String getname() {
    	 return name;
     }
}
