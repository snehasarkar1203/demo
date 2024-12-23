package Interface;

public class Child_Creditcard_Payment implements Parent_Payment {
	
	private int cardnumber;
	
		public Child_Creditcard_Payment(int cardnumber) {
		super();
		this.cardnumber = cardnumber;
	}
		@Override
		public void makepayment( int amount) {
		System.out.println("card number is"+cardnumber);
		}
		@Override
		public void refund(int amount) {
			System.out.println("card number is"+cardnumber);
		}

}
