package Collection;

import java.util.HashSet;
import java.util.Set;

public class Main_Laptop {
public static void main(String[] args) {
	Set <Laptop> l=new HashSet<>();
	Laptop a=new Laptop(l);
	a.addLaptop(l);
	a.display(l);
}
}
