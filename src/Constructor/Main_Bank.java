package Constructor;

public class Main_Bank {
	public static void main(String[] args) {
		//parameterized
		Bank s=new Bank("BOI",9612101,45000);
		System.out.println("name="+s.getname());
		System.out.println("Accountno="+s.getAccountno());
		System.out.println("balance="+s.getbalance());
		
		//deposite
		s.deposite(10000);
		double b=s.getbalance();
		System.out.println(b);
		
		//withdraw
		s.withdraw(4000);
		double b1=s.getbalance();
		System.out.println(b1);
		
//		s.setname("BOI");
//		s.setAcoountno(9612101);
//		s.setbalance(45000);
		
		String name=s.getname();
		long Accountno=s.getAccountno();
		double balance=s.getbalance();	
	}
}
