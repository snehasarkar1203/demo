package Array;

public class Main_College {
public static void main(String[] args) {
	College c=new College();
	c.accept();
	c.display();
	c.sortCollege();
	System.out.println("sort by no of student");
	c.display();
	c.sortCollegebyname();
	System.out.println("sort by name");
	c.display();
	c.deleteCollege("B");
	c.display();
}
}
