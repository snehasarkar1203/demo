package Constructor;

import java.util.Scanner;

public class Animal {
	private String name;
	private int age;
	private String species;
	private float weight;
	private  boolean isDomestic;
	public Animal() {
	}
	public Animal(String n,int a,String q,float w,boolean t) {
	name=n;
	age=a;
	species=q;
	weight=w;
	isDomestic=t;
	}
		public void display() {
			System.out.println("name="+name);
			System.out.println("age="+age);
			System.out.println("species="+species);
			System.out.println("weight="+weight);
			System.out.println("isDomestic="+isDomestic);
			
		}
	}

