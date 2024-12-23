package Array;

public class Main_Decending_Array {
public static void main(String[] args) {
	int a[]=new int[5];
	Decending_Array aa=new Decending_Array();
	aa.accept(a);
	aa.display(a);
	aa.sort(a);
	System.out.println();
	aa.display(a);
	aa.biggest(a);
}
}
