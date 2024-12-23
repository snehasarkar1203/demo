package Array;

public class Main_Sorting {
	public static void main(String[] args) {
		int b[]=new int[5];
		Sorting s=new Sorting();
		s.accept(b);
		s.display(b);
		s.sort(b);
		System.out.println();
		s.display(b);
	}

}
