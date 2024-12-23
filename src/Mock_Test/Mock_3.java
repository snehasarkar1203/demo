package Mock_Test;

public class Mock_3 {
	public static void main(String[] args) {
		int a=10, count=0;
		for (int i = 1; i <=a; i++) {
			if(a%i==0) {
				count++;
				
			}
			
		}
		if (count==2) {
			System.out.println(" the no is prime");
		}else {
			System.out.println(" the no is not prime");
		}
	}

}
