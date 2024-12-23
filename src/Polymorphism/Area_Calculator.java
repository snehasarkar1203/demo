package Polymorphism;

public class Area_Calculator {
	public double calculatearea(double a, double v) {
		double arearectangle=0;
		arearectangle=a*v;
		return arearectangle;
	}
	public double calculatearea(double r) {
		double areacircle=0;
		areacircle=3.14*r*r;
		return areacircle;
	}
	public int calculatearea(double a, double b, double c) {
		int areatriangle=0;
		double s=(a+b+c)/2;
		double area=s*(s-a)*(s-b)*(s-c);
		areatriangle= (int)Math.sqrt(area);
		return areatriangle;
		
		
			}
	private int s(int a,int b,int c) {
		int s=0;
		for (int i = 0; i <=b; i++) {
			s=(a+b+c)/2;
		}
		return s;
	}
	public static void main(String[] args) {
		Area_Calculator a=new Area_Calculator();
		double arearectangle=a.calculatearea(2.2,8.4);
		System.out.println(arearectangle);
		double areacircle=a.calculatearea(5);
		System.out.println(areacircle);
		double areatriangle=a.calculatearea(5.2,8.3,7.4);
		System.out.println(areatriangle);
	}

}
