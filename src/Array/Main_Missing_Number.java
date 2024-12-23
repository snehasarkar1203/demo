package Array;

public class Main_Missing_Number {
public static void main(String[] args) {
	int a[]=new int [5];
	Missing_number m=new Missing_number();
	m.accept(a);
	m.display(a);
	int i=m.missingnumber(a);
	System.out.println("missing number="+i);
}
}
