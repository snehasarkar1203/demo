package Exception;

public class Try_Catch {
	void m1() {
		try {
			int a=10,b=0;
			int d=a/b;
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Try_Catch t= new Try_Catch();
		t.m1();
		System.out.println("successfull");
	}
}
