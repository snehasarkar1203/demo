package Inheritance;

public class Main_Vehicle {
	public static void main(String[] args) {
		Parent_Vehicle a=new Parent_Vehicle();
		a.startEngine();
		Child_Car_Vehicle b=new Child_Car_Vehicle();
		b.drive();
		Child_Model_Vehicle c=new Child_Model_Vehicle();
		c.model();
		Child_Engine_Vehicle d=new Child_Engine_Vehicle();
		d.fuel();
	}

}
