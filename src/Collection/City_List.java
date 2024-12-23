package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City_List {
	void arraylist(List l) {
		l.add("Pune");
		l.add("Nashik");
		l.add("Nagpur");
		l.add("Wardha");
		System.out.println(l);
		Collections.sort(l);
		System.out.println("after sorting");
		System.out.println(l);
	}
	public static void main(String[] args) {
		City_List c=new City_List();
		List l=new ArrayList();
		c.arraylist(l);
	}
		}
