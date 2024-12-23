package Basic;

public class Sum_of_divisible {
	public static void main(String[] args) {
		int sum=0;
	
		for(int i=12; i<=44; i++) {
			if(i%5==0) {
			sum+=i; 
		}
					}
		System.out.println("sum of number from 12 to 44 is divisible by 5"+sum);
	}
}


