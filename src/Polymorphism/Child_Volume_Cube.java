package Polymorphism;

public class Child_Volume_Cube extends Parent_Volume_Calculator{
private int side;
private double volume;

public Child_Volume_Cube(int side) {
	super();
	this.side = side;

}

double calculatevolume() {
	volume=side^3;
	System.out.println("the volume of cube is="+volume);
	return volume;
}
}
