package Interface;

public class Child_Express_Shipment implements Parent_Shipment,Child_Insurance_Shipment {
	private double weight;
	private  double costperkg;
	private String trackingnumber;
	private double insuranceamount;
	public Child_Express_Shipment(double weight, double costperkg, String trackingnumber, double insuranceamount) {
		super();
		this.weight = weight;
		this.costperkg = costperkg;
		this.trackingnumber = trackingnumber;
		this.insuranceamount = insuranceamount;
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
	@Override
	public void addinsurance(double amount) {
	    System.out.println("456893");
	}
	@Override
	public void getinsurancedetails() {
		System.out.println("amount of interest");
	}


	

}
