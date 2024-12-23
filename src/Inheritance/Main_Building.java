package Inheritance;

public class Main_Building {
	public static void main(String[] args) {
		Parent_Building p=new Parent_Building("Jm road ");
		p.displayParent_building();
		Child_Building c=new Child_Building("Jm road", 8);
		c.displayChild_Buildingdetails();
	}

}
