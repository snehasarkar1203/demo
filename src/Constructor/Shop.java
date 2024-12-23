package Constructor;

public class Shop {
	private String name;
	private int noOfEmployee;
	public Shop() {
}
	public Shop(String n,int no) {
		name=n;
		noOfEmployee=no;
	}
	public void display() {
		System.out.println("name="+name);
		System.out.println("noOfEmployee="+noOfEmployee);
	}
}

