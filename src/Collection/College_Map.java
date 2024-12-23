package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class College_Map {
    public static void main(String[] args) {
     List nagpur=new ArrayList();
     nagpur.add("rcoem");
     nagpur.add("ycc");
     nagpur.add("vnit");
     
     List pune=new ArrayList();
     pune.add("coep");
     pune.add("modern");
     pune.add("dy patil");
     
     List chandrapur=new ArrayList();
     chandrapur.add("rcert");
     chandrapur.add("bit");
     chandrapur.add("sai");
     
		HashMap<Integer,String>a=new HashMap<Integer,String>();
		a.put(2,"nagpur");
		a.put(6,"pune");
		a.put(8,"chandrapur");
		System.out.println("1st way=");
		System.out.println(a);
		System.out.println("2nd way=");
		
		for (Entry<Integer, String> entry:a.entrySet()) {
			System.out.println("keys "+entry.getKey()+" =");
			System.out.println("values "+entry.getValue());
			
		}
    }

	@Override
	public String toString() {
		return "College_Map [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
