package Inheritance;

public class Main_Computer {
	public static void main(String[] args) {
		Parent_Computer p=new Parent_Computer("HP");
		p.displayParent_Computer();
		Child_Computer c=new  Child_Computer("DELL", 2.5);
		c.displayChild_Computerdetails();
		
	}

}
