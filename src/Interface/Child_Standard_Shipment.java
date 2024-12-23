package Interface;

public class Child_Standard_Shipment implements Parent_Shipment {
	private double weight;
	private double costperkg;
	private String trackingnumber;
	
	public Child_Standard_Shipment(double weight, double costperkg, String trackingnumber) {
		super();
		this.weight = weight;
		this.costperkg = costperkg;
		this.trackingnumber = trackingnumber;
	}
	@Override
	public void calculatecost() {
		System.out.println("weight costperkg");
	}
	@Override
	public void getdeliverytime() {
		System.out.println("the time");
	}
	@Override
	public void trackshipment() {
		System.out.println("track the order");
	}
	

}
