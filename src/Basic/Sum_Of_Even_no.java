package Basic;

public class Sum_Of_Even_no {
	public static void main(String[] args) {
		int sum=0;
		
		//loop from 23 to 55
		for (int i=23; i<=55; i++) {
			if (i%2==0) {
				sum+=i;
				
		//disp-lay the sum
							}
		}
		System.out.println("sum of even number from 23 to 55 is "+sum);
	}
}
