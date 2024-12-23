package Collection;

import java.util.Scanner;
import java.util.Set;

public class Laptop {
	private String companyName;
	private int price;
	
	public Laptop(Set <Laptop> l) {
	}
	public Laptop(String CompanyName,int price) {
		super();
		this.companyName=companyName;
		this.price=price;
	}
	void addLaptop(Set <Laptop> l) {
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("enter the laptop name");
			companyName=s.next();
			System.out.println("enter the price");
			price=s.nextInt();
			l.add(new Laptop(companyName,price));
		}
	}
	void display(Set <Laptop> l) {
		System.out.println(l);
	}
	@Override
	public String toString() {
		return"Laptop[ companyName=" + companyName + " price= " + price + "]";
	}
}
