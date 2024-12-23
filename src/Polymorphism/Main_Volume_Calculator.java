package Polymorphism;

import java.util.Scanner;

public class Main_Volume_Calculator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		Parent_Volume_Calculator a=new Parent_Volume_Calculator();
		a.calculatevolume();
		System.out.println("enter side");
		int side=s.nextInt();
		Child_Volume_Cube c=new Child_Volume_Cube(side);
		c.calculatevolume();
		System.out.println("enter radius");
		double radius=s.nextDouble();
		Child_Volume_Sphere c1=new Child_Volume_Sphere(radius);
		c1.calculatevolume();
		System.out.println("enter radius and height");
		double radius1=s.nextDouble();
		double height=s.nextDouble();
		Child_Volume_Cylinder c2=new Child_Volume_Cylinder(height,radius);
		c2.calculatevolume();
		
	}

}
