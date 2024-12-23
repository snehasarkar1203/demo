package Abstraction;

public class Main_3D_Shape {
	public static void main(String[] args) {
		Child_3D_Sphere_Shape s=new Child_3D_Sphere_Shape();
			s.show();
			s.calculatesurfacearea();
			s.calculatevolume();
		Child_3D_Cube_Shape  c=new Child_3D_Cube_Shape();
		c.calculatesurfacearea();
		c.calculatevolume();
			
		}
}
