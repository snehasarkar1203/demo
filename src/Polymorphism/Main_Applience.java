package Polymorphism;

public class Main_Applience {
	public static void main(String[] args) {
		Parent_Appliance p=new Parent_Appliance();
		p.turnon();
		Child_Applience_Refrigerator r=new Child_Applience_Refrigerator();
		r.turnon();
		Child_Applience_Washingmachine w=new Child_Applience_Washingmachine();
		w.turnon();
	}

}
