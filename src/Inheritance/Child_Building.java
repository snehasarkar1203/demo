package Inheritance;

public class Child_Building extends Parent_Building {
	private int noOfRooms;
	public Child_Building() {
	}
	public Child_Building(String address,int noOfRooms) {
		super(address);
		this.noOfRooms=noOfRooms;
	}
	void displayChild_Buildingdetails() {
		super.displayParent_building();
		System.out.println("number of rooms "+noOfRooms);
	}

}
