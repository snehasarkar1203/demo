package Polymorphism;

public class Main_Shape {
	public static void main(String[] args) {
		Parent_Shape s=new Parent_Shape();
		s.display();
		Child_Shape_circle c=new Child_Shape_circle();
		c.display();
		Child_Shape_Rectangle r=new Child_Shape_Rectangle();
		r.display();
	}

}
