package Collection;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;

	public class Array_List {
		void ArrayList(List  l) {
			l.add(12);
			l.add(14);
			l.add(11);
			l.add(143);
			System.out.println("1 way=>");
			System.out.println(l);
			System.out.println("2 way=>");
			for (int i = 0; i < l.size(); i++) {
				System.out.println(l.get(i));	
			}
			System.out.println("3 way=>");
				for(Object ob:l) {
					System.out.println(ob);
			}
				System.out.println("4 way=>");
				Iterator iterator=l.iterator();
				while(iterator.hasNext()) {
					System.out.println(iterator.next());
				}
		}
		public static void main(String[] args) {
			Array_List a=new Array_List();
			List l=new ArrayList();
			a.ArrayList(l);
		}
	}

