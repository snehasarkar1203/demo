package Basic;

public class Product_of_divisible {
	public static void main(String[] args) {
		int start=8;
		int end=17;
		int product=1;
		for (int i=start; i<=end; i++) {
			if(i%3==0) {
				product*=i;
			}
		}
		System.out.println("the product of numberfrom "+start+"to"+end+"divisible by 3 is "+product);
	}

}
