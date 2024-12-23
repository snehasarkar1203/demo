package Methods;

public class Sum_product_average_area {
	public int sum() {
		 int sum=0;
		 for(int i=20; i<=50; i++) {
			 if(i%3==0 && i%5==0) {
				 sum=sum+i;
			 }
		 }
		 return sum;	
	}
	public int product() {
		int product=1;
		int i=11;
		while(i<=41) {
			if(i%7==0 && i%2==0)
				product =product*i;
			i++;
		}
		return product;
	}
	
	public double average() {
		double average=0.0;
		int i=5;
		int sum=0;
		do {
			sum=sum+i;
			average=sum/10;
			i++;
		}while(i<=15);
		return average;
		}

	public double area(double r) {
		double A;
		A=3.14*r*r;
		return A;
	}
     
}


