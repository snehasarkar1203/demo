package Logical;

public class Rectangle {
	private double length;
	private double width;
	public Rectangle() {
	}
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double getarea() {
	double area=length*width;
	return area;
	}
	public void comparearea(Rectangle other) {
		  double area1=this.getarea();
		  double area2=other.getarea();
		  compare(area1,area2);
		  }
	public void compare( double area1, double area2 ) {
	  if(area1>area2) {
	  System.out.println("area1 of rectangle is greater");
	}if(area1<area2) {
		System.out.println("area2 of rectangle is greater");
	}else {
		System.out.println("");
	}
}
}
