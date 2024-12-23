package Collection;

import java.util.ArrayList;
import java.util.List;

public class City_List_Lambda {
		void city(List<String>l) {
				l.add("Pune");
				l.add("Shirdi");
				l.add("Nagpur");
				l.add("Wardha");
				System.out.println(l);			

				l.forEach((n)->System.out.println(n.toUpperCase()));
				l.forEach((n)->System.out.println(n.toLowerCase()));
	}
		public static void main(String[] args) {
			City_List_Lambda c=new City_List_Lambda();
			List<String>c1=new ArrayList<String>();
            c.city(c1);
		}
}