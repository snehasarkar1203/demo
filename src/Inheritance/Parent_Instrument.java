package Inheritance;

public class Parent_Instrument {
	private String name;
	public Parent_Instrument() {
	}
	public Parent_Instrument(String name) {
		super();
		this.name=name;
		
	}
	void displayParent_Instrument() {
		System.out.println("name of instrument"+name);
	}

}
