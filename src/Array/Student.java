package Array;

import java.util.Scanner;

public class Student {
	private String name;
	private int marks;
	private int age;
	public Student(String n,int m,int a) {
		name=n;
		marks=m;
		age=a;
	}
	public Student() {
}
	public void accept(Student e[]) {
	Scanner s=new Scanner(System.in);
	for (int i = 0; i < e.length; i++) {
		System.out.println("enter name");
		name=s.next();
		System.out.println("enter marks");
		marks=s.nextInt();
		System.out.println("enter age");
		age=s.nextInt();
		e[i]=new Student(name,marks,age);
	}
}
	void sortStudent(Student e[]) {
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e.length-i-1; j++) {
				if(e[j].marks>e[j+1].marks) {
					Student temp=e[j];
					e[j]=e[j+1];
					e[j+1]=temp;
				}
			}
		}
	}
	void sortonname(Student[]e) {
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e.length-i-1; j++) {
				if(e[j].name.compareTo(e[j+1].name)>0) {
			     Student temp=e[j];
			     e[j]=e[j+1];
			     e[j+1]=temp;
				}
			}
				
		}
	}
	void display(Student[]e) {
		for (int i = 0; i < e.length; i++) {
			System.out.println("name="+e[i].name);
			System.out.println("marks="+e[i].marks);
			System.out.println("age="+e[i].age);
		}
			
		}
	}
