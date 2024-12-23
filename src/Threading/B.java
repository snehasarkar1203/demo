package Threading;

public class B extends Thread{
	@Override
	public void run () {
	System.out.println("child Thread");
	}
	public static void main (String[] args) {
	B b1=new B ();
	b1.run();
	b1.start();
	System.out. println ("Line") ;
}
	}
