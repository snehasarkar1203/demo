package Threading;

public class E extends Thread{
	@Override
	public void run () {
	System. out. println ("child Thread") ;
	System.out.println (Thread. currentThread ().getName () ) ;
	System. out.println (Thread.currentThread().getPriority ());
	}
	public static void main (String[] args) {
	System. out.println (Thread. MAX_PRIORITY) ;
	System. out. println (Thread.MIN_PRIORITY) ;
	System. out. println (Thread. NORM_PRIORITY) ;
	System. out.println (Thread. currentThread(). getName ()) ;
	System. out.println (Thread. currentThread().getPriority()) ;
	//Thread.currentThread () . setPriority (8) ;
	//Thread. currentThread () .setPriority (18);//java. lang.IllegalArgumentException
	E e1=new E () ;
	e1. start () ;
	E e2=new E() ;
	e2. start () ;
	e1. start () ;//java. lang. IllegalThreadStateException
}
}
