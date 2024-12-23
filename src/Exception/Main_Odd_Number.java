package Exception;

public class Main_Odd_Number {
	void m1()throws Odd_Number{
		int a=3;
		if(a%2==0) {
			System.out.println("no Exception");
		}else {
		throw new Odd_Number("odd number Exception");
		}
	}
	public static void main(String[] args) {
		Main_Odd_Number m=new Main_Odd_Number();
		try {
			m.m1();
		}catch(Odd_Number e) {
			System.out.println(e.getMessage());
}
	}
}
