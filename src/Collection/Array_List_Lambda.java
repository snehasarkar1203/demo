package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Array.Array;

public class Array_List_Lambda {
  public static void main(String[] args) {
	Array_List_Lambda a=new Array_List_Lambda();
	List<Integer> l=new ArrayList();
	a.display(l);
}
 void display(List<Integer> l) {
     l.add(23);
     l.add(34);
     l.add(67);
     l.add(76);
     l.add(22);
     l.add(11);
     l.add(10);
     l=Arrays.asList(5,6,34,77,98);
     l.forEach((n)->System.out.println(n));
}
  
}
