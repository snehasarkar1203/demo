package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Shop_Treeset implements Comparable<Shop_Treeset>{
private String name;
private int noofemployee;

public Shop_Treeset() {
	
}
public Shop_Treeset(String name,int noofemployee) {
	super();
	this.name=name;
	this.noofemployee=noofemployee;
}
@Override
public String toString() {
	return "Shop_Treeset [name=" + name + ", noofemployee=" + noofemployee + "]";
}
@Override
public int compareTo(Shop_Treeset o) {
	return Integer.compare(this.noofemployee, o.noofemployee);
}
}

