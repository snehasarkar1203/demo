package Collection;

public class Main_Swap_Display {
public static void main(String[] args) {
	Swap_Display s=(int a,int b)->{
		int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	};
	s.show(5, 3);
}
}
