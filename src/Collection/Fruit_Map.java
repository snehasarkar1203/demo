package Collection;

import java.util.HashMap;
import java.util.Map;

public class Fruit_Map {
	public static void main(String[] args) {
		Map<Integer,String>a=new HashMap<Integer,String>();
		a.put(10,"Apple");
		a.put(20,"Banana");
		a.put(30,"Cikku");
		a.put(40,"Mango");
		System.out.println("1st way=");
		System.out.println(a);
		System.out.println("2nd way");
		for (Map.Entry<Integer,String> entry:a.entrySet()) {
			System.out.println("keys "+entry.getKey()+" =");
			System.out.println("values "+entry.getValue());
		}
}
}
