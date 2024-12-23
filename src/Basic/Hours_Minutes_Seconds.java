package Basic;

import java.util.Scanner;

public class Hours_Minutes_Seconds {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int totalseconds=4556;
		int hours=totalseconds/3600;
		int remainingseconds=totalseconds%3600;
		int minutes=remainingseconds/60;
		int seconds=remainingseconds%60;
		
		System.out.println(totalseconds + " seconds is equivalent to ");
		System.out.println(hours + " hours "+ minutes + " minutes and " + seconds + " seconds ");
	}

}
