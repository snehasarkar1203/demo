package Interface;

public class Child_Phonepay_Payment implements Parent_Payment{
  private int phonenumber;

public Child_Phonepay_Payment(int phonenumber) {
	super();
	this.phonenumber = phonenumber;
}
@Override
public void makepayment(int amount) {
	System.out.println("phone number is"+phonenumber);
}
@Override
public void refund (int amount) {
	System.out.println("phone number is "+phonenumber);
}
}
