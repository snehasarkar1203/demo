package Exception;

public class Multiple_Exception {
   void m1() {
	   try {
		   int a=10,b=11;
			int d=a/b;
		   int s[]= {1,2,3};
		   System.out.println(s[2]);
		String f=null;
		System.out.println(f.length());		
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
	   } catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println(e.getMessage());
		   e.printStackTrace();
	   } catch(NullPointerException e) {
		   System.out.println(e.getMessage());
		   e.printStackTrace();
	   }
   }
   public static void main(String[] args) {
	Multiple_Exception m=new Multiple_Exception();
	m.m1();
	System.out.println("successfull");
}
}
