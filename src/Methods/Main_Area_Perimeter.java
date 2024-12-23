package Methods;

public class Main_Area_Perimeter {
	public static void main(String[] args) {
		Area_Perimeter a1=new Area_Perimeter();
		
		double area=a1.area(6,3);
		System.out.println(area);
		
		double perimeter=a1.perimeter(5,9);
	    System.out.println(perimeter); 
	    
	    double celsiusToFahrenheit =a1.celsiusToFahrenheit(33.6);
	    System.out.println(celsiusToFahrenheit);
	    
	    int sumOfDigit=a1.sumOfDigit(123);
	    System.out.println(sumOfDigit);
	    
	   Display_Grade a2=new Display_Grade();
	    boolean isTriangle=a2.isTriangle(3,4,5);
	   System.out.println(isTriangle);
	   
	   int displayGrade=a2.displayGrade(85);
	   System.out.println(displayGrade);
	}
}  
