package Methods;

public class Main_Sum_product_average_area {
	public static void main(String[] args) {
		Sum_product_average_area a1=new Sum_product_average_area();
	   int sum=a1.sum();
	   System.out.println(sum);
		
       int product=a1.product();
       System.out.println(product);
       
       double average=a1.average();
       System.out.println(average);
       
       double area=a1.area(4.2);
       System.out.println(area);
       
	}
}
