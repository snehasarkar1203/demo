package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Sum_Average {
public static void main(String[] args) {
	List<Integer>l=new ArrayList<Integer>();
	Sum_Average.streamex(l);
}
 static void streamex(List<Integer> l) {
	l.add(12);
	l.add(34);
	l.add(45);
	l.add(28);
	l.add(34);
	l.add(45);
	l.add(23);
	l.add(35);
	l.stream().forEach(n->System.out.println(n));
	int sum=l.stream().mapToInt(k->k).sum();
	OptionalDouble average=l.stream().mapToInt(n->n).average();
	System.out.println(average);
	
	

	
}
}
