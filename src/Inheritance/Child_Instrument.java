package Inheritance;

public class Child_Instrument extends Parent_Instrument{
	private int noOfString;
	public Child_Instrument() {
	}
	public Child_Instrument(String name,int noOfString) {
		super(name);
		this.noOfString=noOfString;
	}
	void displayChild_Instrument() {
		super.displayParent_Instrument();
		System.out.println("number of String is"+ noOfString);
	}

}
