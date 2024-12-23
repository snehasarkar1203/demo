package Basic;

public class Product_Of_Odd_nO {
	public static void main(String[] args) {
		 int product =1;
		for (int i=28; i<=37; i++) {
			if(i%2!=0) {
				product*=i;
			}
		}
		System.out.println("product of odd number from 28 to 37 is "+product);
	}
}
