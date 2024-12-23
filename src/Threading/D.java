package Threading;

public class D extends Thread{
	@Override
	public void run () {
	System. out.println ("child Thread") ;
	System. out.println (Thread.currentThread().getName ()) ;
	System.out.println (Thread. currentThread().getPriority());
	}
	public static void main (String[] args) {
	System. out.println (Thread. currentThread().getName ()) ;
	System. out.println (Thread. currentThread().getPriority()) ;
	D d1=new D() ;
	d1. setPriority (8) ; 
	d1. setName ("Pavan") ;
	d1.start () ;
	D d2=new D() ;
	d2. setPriority (10) ;
	d2. setName ("Sidhesh") ;
	d2. start ();
}
}