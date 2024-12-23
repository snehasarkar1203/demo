package Basic;

public class Using_Loop_4 {
	public static void main(String[] args) {
		//using for loop
		System.out.println("using for loop");
		for(int i=11; i>=-33; i-=4) {
			System.out.println(i);
		}
		
		//using while loop
		System.out.println("using while loop");
		int j=11;
		while(j>=-33) {
			System.out.println(j);
			j-=4;
		}
		
		//using do-while loop
		System.out.println("using do-while loop");
		int k=11;
		do {
			System.out.println(k);
			k-=4;
		} while (k>=-33);
	}

}
