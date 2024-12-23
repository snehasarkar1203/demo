package Basic;

public class Using_loop_2 {
public static void main(String[] args) {
	//using for loop
	System.out.println("using for loop");
	for(int i=1; i<=10; i++) {
		System.out.println(i);
	}
	
	//using while loop
	System.out.println("using while loop");
	int j=1;
	while(j<=10) {
		System.out.println(j);
		j++;
	}
	
	//using do-while loop
	System.out.println("using do-while loop");
	int k=1;
	do {
		System.out.println(k);
		k++;
	} while(k<=10);
	
}
}
