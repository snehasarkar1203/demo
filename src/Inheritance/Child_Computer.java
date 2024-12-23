package Inheritance;

public class Child_Computer extends Parent_Computer {
	private double weight;
	public Child_Computer() {
	}
	public Child_Computer(String brand,double weight) {
		super(brand);
		this.weight=weight;
	}
	void displayChild_Computerdetails() {
		super.displayParent_Computer();
		System.out.println("weight of laptop is"+weight);
	}

}
