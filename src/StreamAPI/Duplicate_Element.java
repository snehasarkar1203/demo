package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate_Element {
	public static void main(String[] args) {
	List<Integer>l=new ArrayList<Integer>();
	Duplicate_Element.streamex(l);
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
	List<Integer>duplicate=l.stream().distinct().collect(Collectors.toList());
	System.out.println(duplicate);
	}
}
