package Collection;

import java.util.ArrayList;
import java.util.List;

public class Color_List {
	void arraylist(List c,List h) {
		c.add("red");
		c.add("yellow");
		c.add("blue");
		c.add("black");
		System.out.println(c);
		System.out.println("1 way=>");
        List b;
        b=List.copyOf(c);
		System.out.println("2 way=>");
		h.addAll(c);
		System.out.println(h);
	}
		public static void main(String[] args) {
		 Color_List a=new Color_List();
		 List b=new ArrayList();//way 1
		 List g=new ArrayList();//way 2
		 a.arraylist(b,g);//for way 1 pass only 1 argument"b"....for way 2 pass only 2 argument "b,c"	
		 System.out.println("list b="+b);
			}
}
