package Array;

public class Prime {
	
	void checkprime(int n) {
		int count=0;
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				count++;
			}	
		}
		if(count==0) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}

}
