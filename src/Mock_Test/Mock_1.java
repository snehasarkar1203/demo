package Mock_Test;

public class Mock_1 {
	public static void main(String[] args) {
		int year= 2020;
	    boolean result=false;
	
		if ((year%4==0)&& (year%400==0)||(year%100!=0)){
			System.out.println(year +" is a leap year");
		}else {
			System.out.println(year +" is not a leap year");
			
		}
		
		
	}

}
