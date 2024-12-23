package Inheritance;

public class Child_Employee_Person extends Child_Student_Person {
	 double salary;
		public Child_Employee_Person() {
		}
		public Child_Employee_Person( String n,double s) {
			name=n;
			salary=s;
	}
        void details() {
			System.out.println("person has name="+name);
			System.out.println("salary is="+salary);
		}

}
