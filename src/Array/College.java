package Array;

import java.util.Scanner;

public class College {
  private String name;
  private int noofstu;
  public College() {
  }
  College c[]=new College[3];
public College(String name, int noofstu) {
	super();
	this.name = name;
	this.noofstu = noofstu;
}
 public void accept() {
	 Scanner s=new Scanner(System.in);
	 for (int i = 0; i < c.length; i++) {
		System.out.println("enter name");
		name=s.next();
		System.out.println("enter no of student");
		noofstu=s.nextInt();
		c[i]=new College(name, noofstu);
	}
 }
 public void sortCollege() {
	 for (int i = 0; i < c.length; i++) {
		 for (int j = 0; j < c.length-1-i; j++) {
			if(c[j].noofstu>c[j+1].noofstu) {
				College temp =c[j];
				c[j+1]=c[j];
				c[j]=temp;
		}
	}
	 }
 }
 public void display() {
	 for (int i = 0; i < c.length; i++) {
		System.out.println(c[i]);
	}
 }
 @Override
 public String toString() {
	 return"College[name=" + name+", noofstu=" + noofstu +"]";
 }

public void sortCollegebyname() {
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c.length-1-i; j++) {
			if(c[j].name.compareTo(c[j+1].name)>0) {
				College temp =c[j];
				c[j+1]=c[j];
				c[j]=temp;
		}
	}
}
}
public void deleteCollege(String name) {
	for (int i = 0; i < c.length; i++) {
		if(c[i].name.equals(name)) {
			c[i]=null;
		}
		
	}
}
}
