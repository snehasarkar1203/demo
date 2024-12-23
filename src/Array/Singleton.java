package Array;

public class Singleton {
public static Singleton s=new Singleton();
private Singleton() {
	
}
static Singleton getInstance() {
	return s;
}
}
