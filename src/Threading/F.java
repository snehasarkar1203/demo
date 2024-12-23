package Threading;

public class F extends Thread{
	@Override
	public void run () {
	try {
	for (int k=1;k<=5;k++) {
	if (this.currentThread ().getName ().equals ("Pavan") ) {
	System. out.println ("Child Thread -> "+this.currentThread () . getName () ) ;
	Thread. sleep (1000);
	}
	else if (this. currentThread() . getName ().equals ("Siddesh") ) {
	System. out. println ("Child Thread -> "+this. currentThread ().getName () ) ;
	Thread. sleep (500) ;
	}
	}
	}catch (InterruptedException e) {
	System. out. println (e) ;
	}
	}
	public static void main (String[] args) {
	F g1=new F() ;
	g1. setName ("'Pavan") ;
	g1. start ();
	for (int k=1; k<=5; k++) {
	System. out.println ("Main Thread") ;
	}
	F g2=new F() ;
	g2. setName ("Siddesh") ;
	try {
	g1. start () ;
	g1. join () ;
	} catch (InterruptedException e) {
   }
	g2.start () ;
	}
}
