package Inheritance;

public class Twin_Prime {
	void prime() {
		for (int i = 1; i <= 100; i++) {
			if(prime(i)&& prime(i+2)) {
				System.out.println(i);
			}
		}
	}
        boolean prime(int n) {
	    int i;
	    int count=0;
	    for(i=1;i<=n;i++) {
		if(n%i==0) {
			count++;
		}
	}
	   if (count==2) {
		  return true;
	}  else {
		  return false;
	}
}
}
