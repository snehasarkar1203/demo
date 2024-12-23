package Collection;

import java.util.HashSet;
import java.util.Set;

public class Hashset_to_Array {
void displayset(Set a) {
	a.add(11);
	a.add(22);
	a.add(33);
	a.add(44);
	a.add(55);
	System.out.println(a);
}
public static void main(String[] args) {
	Hashset_to_Array h=new Hashset_to_Array();
	Set s=new HashSet();
	h.displayset(s);
	Object[]b=s.toArray();
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
}
}
