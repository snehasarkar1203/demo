package Polymorphism;

public class Max_Finder {
	public int findmax(int a,int v) {
		int biggest=0;
		if(a>biggest) {
		}
		return biggest;
	}
	public double findmax(double a,double v,double c) {
		double biggest=0;
		if(a>v && a>c) {
			biggest=a;
		}else if(v>c && v>a) {
			biggest=v;
		}else {
			biggest=c;
		}
		return biggest;
	}
	public int findmax(int a,int v,int s,int c) {
		int biggest=0;
		if(a>v && a>c) {
			biggest=a;
		}else if(v>s && v>c && v>a) {
			biggest=v;
		}else if(s>c && s>a && s>v) {
			biggest=s;
		}else {
			biggest=c;
		}
		return biggest;
	}
	public static void main(String[] args) {
		Max_Finder m=new Max_Finder();
		int biggest=m.findmax(5, 2);
		System.out.println(biggest);
		double biggest1=m.findmax(8, 3.33, 7.8);
		System.out.println(biggest1);
		int biggest2=m.findmax(4, 8, 7, 9);
		System.out.println(biggest2);
	}

}
