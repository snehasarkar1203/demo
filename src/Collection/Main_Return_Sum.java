package Collection;

public class Main_Return_Sum {
public static void main(String[] args) {
	Return_Sum r=(int a,int b)->{
		int d=0;
		d=a+b;
		System.out.println(d);
		return d;
	};
	r.show(4, 6);
}
}
