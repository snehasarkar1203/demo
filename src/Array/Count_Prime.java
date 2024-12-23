package Array;

public class Count_Prime {
	void countprime() {
		int count=0;
		for (int i = 1; i <=100; i++) {
			checkprime(i);	
	}	
}
	private void checkprime(int n) {
		int count=0;
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println(n+"");
		}
	}
}
