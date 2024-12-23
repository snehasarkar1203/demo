package Basic;

public class Using_Loop_3 {
public static void main(String[] args) {
	
	//using for loop
	System.out.println("using for loop");
	for(int i=55; i<=88; i+=3) {
		System.out.println(i);
	}
	
	//using while loop
	System.out.println("using while loop");
	int j=55;
	while(j<=88) {
		System.out.println(j);
		j+=3;
	}
	
	//using do-while loop
	System.out.println("using do-while loop");
	int k=55;
	do {
		System.out.println(k);
		k+=3;	
	} while(k<=88);
		
}
}
