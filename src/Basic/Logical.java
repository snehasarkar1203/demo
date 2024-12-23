package Basic;

public class Logical {
	public static void main(String[] args) {
		int a=10, b=5, c=7;
		System.out.println(a>c);
		System.out.println(a>b && b<c);
		System.out.println(a>b && b>c);
		System.out.println(a>b || b<c);
		System.out.println(a>b || b==c);
		System.out.println(a==c);
		System.out.println(!(a==c));
		System.out.println(a!=b || b<c);
		System.out.println(!(a!=b || b<c));
		
	}

}
