package Inheritance;

public class Main_Instrument {
	public static void main(String[] args) {
		Parent_Instrument p=new Parent_Instrument("piano");
		p.displayParent_Instrument();
		Child_Instrument c= new Child_Instrument("piano",3);
		c.displayChild_Instrument();
		
	}

}
