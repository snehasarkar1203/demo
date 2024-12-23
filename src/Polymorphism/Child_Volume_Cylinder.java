package Polymorphism;

public class Child_Volume_Cylinder extends Parent_Volume_Calculator{
	private double height;
	private double radius;
	private double volume;
	
	public Child_Volume_Cylinder(double height, double radius) {
		super();
		this.height = height;
		this.radius = radius;
	}

	double calculatevolume() {
		volume=3.14*radius*2*height;
		System.out.println("the volume of cylinder is="+volume);
		return volume;
	}

}
