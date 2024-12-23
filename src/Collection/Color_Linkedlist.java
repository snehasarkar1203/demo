package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Color_Linkedlist {
     void color(LinkedList l) {
    	l.add("red");
 		l.add("yellow");
 		l.add("blue");
 		l.add("black");
 		System.out.println(l);
 		System.out.println("1 way=>");
 		System.out.println("2 way=>");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));	
		}
		System.out.println("3 way=>");
			for(Object ob:l) {
				System.out.println(ob);
		}
			System.out.println("4 way=>");
			Iterator iterator=l.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			} 
     }
     public static void main(String[] args) {
			Color_Linkedlist a=new Color_Linkedlist();
			LinkedList l=new LinkedList();	
			a.color(l);
}
}
