package Inheritance;

public class Main_Person {
	public static void main(String[] args) {
		Parent_Person a=new Parent_Person("bhushan");
		a.introduce();
		Child_Student_Person b= new Child_Student_Person("bhushan","mcchs");
		b.study();
		Child_Employee_Person c=new Child_Employee_Person("bhushan",40.259);
		c.details();
	}

}
