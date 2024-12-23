package Array;

public class Main_Common {
	public static void main(String[] args) {
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[3];
		Common aa=new Common();
		System.out.println("enter element array 1");
		aa.accept(a);
		System.out.println("enter element array 2");
		aa.accept(b);
		//aa.accept(c);
		aa.common(a, b, c);
		System.out.println("common element");
	    aa.display(c);
	}

}
