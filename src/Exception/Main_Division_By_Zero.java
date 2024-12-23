package Exception;

public class Main_Division_By_Zero {
	public double  m1()throws Division_By_Zero{
		int numerator=12;
		int denominator=0;
		double quotient;
		quotient=numerator/denominator;
		if(denominator==0) {
		throw new Division_By_Zero("Division by zero Exception");
	}
		return quotient;
	}

	public static void main(String[] args) {
		Main_Division_By_Zero m=new Main_Division_By_Zero();
		try {
			double result=  m.m1();
			System.out.println(result);
		}catch(Division_By_Zero e) {
			System.out.println(e.getMessage());
		}
}
}
