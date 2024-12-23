package Array;

public class Main_Add_2_Array {
	public static void main(String[] args) {
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[a.length+b.length];
		Add_2_Array e[]=new Add_2_Array[3];
		Add_2_Array ee=new Add_2_Array();
		System.out.println("enter element array 1");
		ee.accept(a);
		System.out.println("enter element array 2");
		ee.accept(b);
		ee.add(a, b, c);
		ee.display(c);	
	}

}
