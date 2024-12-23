package Array;

public class Main_Ascending_Array {
public static void main(String[] args) {
	int a[]=new int[5];
	Ascending_Array aa=new Ascending_Array();
	aa.accept(a);
	aa.display(a);
	aa.sort(a);
	System.out.println();
	aa.display(a);
}
}
