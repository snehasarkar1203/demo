package Abstraction;

public class Main_Appliance {
	public static void main(String[] args) {
		Child_Refrigerator_Appliance r=new Child_Refrigerator_Appliance();
		r.turnon();
		r.show();
		Child_Washingmachine_Appliance w=new Child_Washingmachine_Appliance();
		w.turnon();
		
	}

}
