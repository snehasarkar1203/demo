package Methods;

public class Area_Perimeter {
	public static int area(int l,int b) {
		int area=l*b;
		return area;
	}
	public  static double perimeter(double l,double b) {
		double d;
		d=2*(l+b);
		return d;
	}
	public static double celsiusToFahrenheit(double f) {
		double d=f*(9/5)+32;
		return d;
	}
	public static int sumOfDigit(int a) {
		int sum=0;
		while(a>0) {
			int i=a%10;
			sum=sum+i;
			a=a/10;	
		}
		return sum;
	}

}
