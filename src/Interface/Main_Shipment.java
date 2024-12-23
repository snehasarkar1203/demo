package Interface;

public class Main_Shipment {
	public static void main(String[] args) {
		Parent_Shipment p=new Child_Standard_Shipment(563, 8963, "sneha");
		p.calculatecost();
		p.getdeliverytime();
		p.trackshipment();
		
		Parent_Shipment p1=new Child_Express_Shipment(8963, 568, "pqr", 5689);
		p1.calculatecost();
		p1.getdeliverytime();
		p1.trackshipment();
		
		Child_Internationalexpress_Shipment p2=new Child_Internationalexpress_Shipment(8, 6, 5, "jkl", "mno", 8);
		p2.getcountry();
		p2.getcustomduties();
		p2.addinsurance(45896.0);
		p2.getinsurancedetails();
		
	}

}
