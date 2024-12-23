package Exception;

public class Arithmetic {
	void performoperation(int a,int b) {
		try {
			System.out.println("add="+(a+b));
	        System.out.println("sub="+(a-b));
	        System.out.println("mul="+(a*b));
	        System.out.println("div="+(a/b));
					
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Arithmetic a=new Arithmetic();
		a.performoperation(4, 0);
		System.out.println("Successfull");
	}
}
