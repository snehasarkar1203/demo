package Polymorphism;

public class Overloading {
	void show(int n) {
		System.out.println(n);
	}
	void show(String name) {
		System.out.println(name);
	}
	void show(int n,int a) {
		System.out.println(n);
		System.out.println(a);
	}
     public static void main(String[] args) {
		Overloading o=new Overloading();
		o.show(20);
		o.show("bhushan");
		o.show(4, 5);
	}
}
