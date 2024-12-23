package Threading;

public class C extends Thread{
	@Override
	public void run () {
	System. out.println ("child Thread") ;
	System. out.println (Thread. currentThread().getName ());
	}
	public static void main (String[] args) {
	C c1=new C() ;
	System.out.println(Thread.currentThread() .getName ()) ;
	c1.start ();
	C c2=new C() ;
	C c3=new C() ;
	c3.start ();
	c3. setName ("Pavan") ;
	System. out.println(c3.getName ()) ;
	c2.start ();
}
}
