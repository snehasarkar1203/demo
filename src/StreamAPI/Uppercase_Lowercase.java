package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Uppercase_Lowercase {
 public static void main(String[] args) {
		List<String>l=new ArrayList<String>();
		Uppercase_Lowercase.streamex(l);
}
 static void streamex(List<String> l) {
     l.add("khushi");
     l.add("chitra");
     l.add("sneha");
     l.add("mansi");
     l.add("tamanna");
     l.add("tanisha");
     l.stream().forEach(n->System.out.println(n));
    List<String> lower=l.stream().map(k->k.toLowerCase()).collect(Collectors.toList());
    System.out.println(lower);
    List<String> upper=l.stream().map(k->k.toUpperCase()).collect(Collectors.toList());
    System.out.println(upper);
    

      
}
}
