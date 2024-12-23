package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Even_Odd {
public static void main(String[] args) {
	List<Integer>l=new ArrayList<Integer>();
	Even_Odd.streamex(l);
}
static void streamex(List<Integer> l) {
	l.add(12);
	l.add(28);
	l.add(11);
	l.add(16);
	l.add(19);
	l.add(03);
	l.stream().forEach(n->System.out.println(n));
    int Even_Odd=l.stream().filter(k->k%2==0).mapToInt(n->n).sum();
    System.out.println("sum of even number"+ Even_Odd);
    int Even_Odd1=l.stream().filter(g->g%2!=0).mapToInt(n->n).sum();
    System.out.println("sum of odd number"+ Even_Odd1);
}
}
