package Inheritance;

public class Main_Animal {
	public static void main(String[] args) {
		Parent_Animal a=new Parent_Animal();
	    a.eat();
	    Child_Animal c=new Child_Animal();
	    c.eat();
	    c.bark();
	}

}
