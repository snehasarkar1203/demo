package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ascending_Decending {
	public static void main(String[] args) {
	List<String>l=new ArrayList<String>();
	Ascending_Decending.streamex(l);
}
 static void streamex(List<String> l) {
	l.add("sneha");
	l.add("khushi");
	l.add("chitra");
	l.add("tamanna");
	l.add("tanisha");
	l.add("dolly");
	l.add("sonu");
	l.add("santro");
	l.stream().forEach(n->System.out.println(n));
	List<String>ascen=l.stream().map(k->k.toLowerCase()).sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
	System.out.println("ascending order = " + ascen);
	List<String>decen=l.stream().map(o->o.toLowerCase()).sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
	System.out.println("descending order = " + decen);
}
}
