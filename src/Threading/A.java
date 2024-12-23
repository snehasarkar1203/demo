package Threading;

public class A extends Thread {
	@Override
	public void run () {
		for (int k=1; k<=5; k++) {
			System. out. println ("Child Thread") ;
		}
	}
	public static void main (String[] args) {
	// System.out.println (12/0) ;
	A al=new A() ;
	al.start () ;
	for (int k=1;k<=5;k++) {
	System. out. println ("Main thread") ;
	}
	 A a2=new A () ;
	a2.start();
}
}
