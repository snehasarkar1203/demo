package Collection;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
public static void main(String[] args) {
	Map<String,Integer>m=new HashMap<String,Integer>();
	m.put("A", 10);
	m.put("B", 20);
	m.put("C", 30);
	m.put("D", 40);
	System.out.println("1st way=");
	System.out.println(m);
	System.out.println("2nd way=");
	for (Map.Entry<String,Integer> entry : m.entrySet()) {
		System.out.println("keys "+entry.getKey()+" =");
		System.out.println("values "+entry.getValue());
	}
	}
}
