package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<Integer>();
		Sum.streamex(l);
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
		l=Arrays.asList(3,5,6,7,8);
		l.stream().forEach(n->System.out.println(n));
	}
}
