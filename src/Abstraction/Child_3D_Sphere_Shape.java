package Abstraction;

public class Child_3D_Sphere_Shape extends Parent_3D_Shape{
	@Override
	void calculatevolume() {
		double vol;
		double r=5;
		vol=4/3*3.14*r*r*r;
		System.out.println("volume of shape is"+vol);
	}
	@Override
	void calculatesurfacearea() {
		double A;
		double r=4;
		A=4*3.14*r*r;
		System.out.println("surface area of shape is"+A);
	}

}
