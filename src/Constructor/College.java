package Constructor;

public class College {
	private String name;
	private int noOfSt;
	
	public College() {
	}
	public College(String n,int no) {
		name=n;
		noOfSt=no;
	}
	void display(int a,College cc) {
		System.out.println(cc.name);
		System.out.println(cc.noOfSt);
		System.out.println("name="+name);
		System.out.println("noOfStudent="+noOfSt);
		
	}
}
