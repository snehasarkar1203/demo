package Constructor;

public class Bank {
	private String name;
	private long Accountno;
	private double balance;
	public Bank() {
}
	public Bank(String n,long a,double b) {
	name=n;
	Accountno=a;
	balance=b;
}
public void display() {
	System.out.println("name="+name);
	System.out.println("Accountno="+Accountno);
	System.out.println("balance="+balance);
}
void setname(String n) {
	name=n;
}
String getname() {
	return name;
}
void setAcoountno(long a) {
	Accountno=a;
}
long getAccountno() {
	return Accountno;
}
void setbalance(double b) {
	balance=b;
}
double getbalance() {
	return balance;
}
public void deposite(double amount) {
	balance=balance+amount;
}
public void withdraw(double amount) {

if(balance>=500) {
	balance=balance-amount;
}else {
	System.out.println("you cannot withdraw");
}
}
}
