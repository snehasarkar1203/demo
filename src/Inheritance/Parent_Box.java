package Inheritance;

public class Parent_Box {
	 double width;
	 double height;
	 double depth;
	 
	 public Parent_Box(double width,double height,double depth) {
		 super();
		 this.width=width;
		 this.height=height;
		 this.depth=depth;
	 }
	 public Parent_Box(double side) {
		 this(side,side,side);
	 }
	 void calculatevolume() {
		 double volume;
		 volume=width*height*depth;
		 System.out.println("volumeof box="+volume);
	 }
	 void display() {
		 System.out.println(height);
		 System.out.println(width);
		 System.out.println(depth);
	 }
}
