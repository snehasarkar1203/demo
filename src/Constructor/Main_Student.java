
package Constructor;

public class Main_Student {
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Dmart");
		s.setnOfEmployee(50);
		
		Student s1=new Student();
		s1.setName("Big bazaar");
		s1.setnOfEmployee(26);
		
		Student s2=new Student();
		s2.setName("Samadhan purti");
		s2.setnOfEmployee(58);

		String name=s.getName();
		int noOfEmployee=s.getnoOfEmployee();
		
		String name1=s1.getName();
		int noOfEmployee1=s1.getnoOfEmployee();
		
		String name2=s2.getName();
		int noOfEmployee2=s2.getnoOfEmployee();
	   
		System.out.println("name="+s.getName());
		System.out.println("noOfEmployee="+s.getnoOfEmployee());
	
		System.out.println("name="+s1.getName());
		System.out.println("noOfEmployee="+s1.getnoOfEmployee());
	
		System.out.println("name="+s2.getName());
		System.out.println("noOfEmployee="+s2.getnoOfEmployee());
	}

}
