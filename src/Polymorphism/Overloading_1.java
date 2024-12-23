package Polymorphism;

public class Overloading_1 {
	public int add(int a,int v) {
		int sum=0;
		sum=a+v;
		return sum;
	}
	public double add(double a,double b,double c) {
		double sum=0;
		sum=a+b+c;
		return sum;
	}
	public int add(int a,int v,int b) {
		int sum=0;
		sum=a+v+b;
		return sum;
	}
	public static void main(String[] args) {
		Overloading_1 o=new Overloading_1();
		int sum=o.add(5, 04);
		System.out.println(sum);
		double sum1=o.add(2.2, 5.5, 4.4);
		System.out.println(sum1);
		int sum2=o.add(8, 7, 2);
		System.out.println(sum2);
	}

}
