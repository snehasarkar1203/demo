package Inheritance;

public class Parent_new_vehicle {
    protected static int totalParent_new_Vehicle=0;
	public Parent_new_vehicle() {
		 totalParent_new_Vehicle++;
	}
	void display() {
		System.out.println("total vehicle"+totalParent_new_Vehicle);
	}
}
