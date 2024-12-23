package Abstraction;

public class Child_3D_Cube_Shape extends Parent_3D_Shape{
	@Override
	void calculatevolume() {
		double volume;
		double a=3.3;
		volume=a*a*a;
		System.out.println("volume of cube is"+volume);
	}
	@Override
	void calculatesurfacearea() {
		double area;
		double a=5.8;
		area=6*a*a;
		System.out.println("surface area of cube is"+area);
	}

}
