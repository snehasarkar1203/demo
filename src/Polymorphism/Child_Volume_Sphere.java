package Polymorphism;

public class Child_Volume_Sphere  extends Parent_Volume_Calculator{
	private double radius;
	private double volume;
	
	public Child_Volume_Sphere(double radius) {
		super();
		this.radius = radius;
	}

	double calculatevolume() {
		volume=4/3*3.14*radius*3;
		System.out.println("the volume of sphere is="+volume);
		return volume;
	}
	

}
