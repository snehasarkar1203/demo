package Array;

public class Main_Singleton {
public static void main(String[] args) {
	Singleton s1=Singleton.getInstance();
	System.out.println(s1);
	Singleton s2=Singleton.getInstance();
	System.out.println(s2);
	}
}
