package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Hash {
	void displayset(Set a,Set b,Set c) {
		a.add(10);
		a.add(20);
		a.add(30);
		
		b.add(11);
		b.add(22);
		b.add(33);
		
		c.add(44);
		c.add(55);
		c.add(66);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		Set_Hash h=new Set_Hash();
		Set s=new HashSet();
		Set s1=new LinkedHashSet();
		Set s2=new TreeSet();
		h.displayset(s, s1, s2);
	}
}
