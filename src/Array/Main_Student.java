package Array;

public class Main_Student {
public static void main(String[] args) {
	Student e[]=new Student[3];
	Student ee=new Student();
	ee.accept(e);
	ee.sortStudent(e);
	
	ee.display(e);
	System.out.println("sort on name");
	ee.sortonname(e);
	ee.display(e);
	
}
}
