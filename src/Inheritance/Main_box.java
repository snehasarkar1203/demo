package Inheritance;

public class Main_box {
public static void main(String[] args) {
	Parent_Box p=new Parent_Box(5.4,2.6,8.5);
	p.calculatevolume();
	p.display();
	Parent_Box p1 =new Parent_Box(5);
	p1.calculatevolume();
	p1.display();
}
}
