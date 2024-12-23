package Methods;

public class Display_Grade {
	public static boolean isTriangle (int a,int b,int c) {
		if(a<=0 || b<=0 || c<=0) {
			return false;
		}
		return(a+b>c)&&(a+c>b)&&(b+c>a);
	}
	
    public static int displayGrade(int percentage) {
    	if (percentage>90) {
    		System.out.println("Grade A");
    	}else if(percentage>80) {
    		System.out.println("Grade B");
    }else if(percentage>70) {
    	    System.out.println("Grade C");
    }else if(percentage>60) {
    	System.out.println("Grade D");
    }else if(percentage>50) {
    	System.out.println("Grade E");
    }else {
    	System.out.println("Grade F");
    }
    	return percentage;
    }
 
}