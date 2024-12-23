package Interface;

public class Main_Payment {
	public static void main(String[] args) {
		Parent_Payment p=new Child_Creditcard_Payment(4555);
		p.makepayment(50000);
		p.refund(1200);
		Parent_Payment p1=new Child_Phonepay_Payment(36977);
		p1.makepayment(3000);
		p1.refund(560);
	}

}
