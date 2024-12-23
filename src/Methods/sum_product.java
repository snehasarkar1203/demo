package Methods;

public class sum_product {
	public void sum() {
	int sum=0;
	for(int i=1; i<=10; i++) {
		sum+=i;
		System.out.println("sum of number from 1 to 10 is "+ sum);
	}	
}
	public void product() {
		int product =1;
		for(int i=1; i<=10; i++) {
			product=product*i;
			System.out.println("sum of product from 1 to 10 is "+ product);
			
		}
	}
}
