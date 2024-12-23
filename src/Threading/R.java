package Threading;

public class R implements Runnable{
	public void run() {
			System. out. println ("child thread") ;
			System. out. println (Thread. currentThread().getName ()) ;
	        }
			public void run (String s) {
			System. out. println (s. length ()) ;
			}
			public static void main (String[] args) {
			A a1=new A();
			a1. run () ;
			Thread th1=new Thread (a1) ; 
			th1.start () ;
			System. out. println ("main thread") ;
			System. out.println (Thread. currentThread() .getName ()) ;
			a1.run();
			}
}

