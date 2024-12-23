package Collection;

import java.util.Scanner;
import java.util.TreeSet;

public class Main_Shop_Treeset {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter no of shop");
	int noofshop=s.nextInt();
	TreeSet<Shop_Treeset>t=new TreeSet<Shop_Treeset>();
	for (int i = 0; i < noofshop; i++) {
		System.out.println("enter a shop name");
		String name=s.next();
		
		System.out.println("enter no of employee");
		int noofemployee=s.nextInt();
		t.add(new Shop_Treeset(name,noofemployee));
	}	
	System.out.println(t);
}
}
