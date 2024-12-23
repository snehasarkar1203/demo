package Collection;

public class Main_Lambda {
public static void main(String[] args) {
	Lambda l=(String str)->{
		System.out.println(str);
	};
	l.show("java 1.8 feature");
}
}
