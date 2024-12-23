package Interface;

public class Child_Internationalexpress_Shipment implements Child_International_Shipment, Child_Insurance_Shipment {
   private double weight;
   private double costperkg;
   private double customduties;
   private String trackingnumber;
   private String destinationcountry;
   private double insuranceamount;
   
public Child_Internationalexpress_Shipment(double weight, double costperkg, double customduties, String trackingnumber,
		String destinationcountry, double insuranceamount) {
	super();
	this.weight = weight;
	this.costperkg = costperkg;
	this.customduties = customduties;
	this.trackingnumber = trackingnumber;
	this.destinationcountry = destinationcountry;
	this.insuranceamount = insuranceamount;
}
   @Override
   public void getcustomduties() {
	   System.out.println("tax amount:");
   }
   @Override
   public void getcountry() {
	   System.out.println("name of country:");
   }
   @Override
	public void addinsurance(double amount) {
	    System.out.println("456893");
	}
	@Override
	public void getinsurancedetails() {
		System.out.println("amount of interest");
	}
	@Override
	public void calculatecost() {
    System.out.println("6589");		
	}
	@Override
	public void getdeliverytime() {
	System.out.println("time");	
	}
	@Override
	public void trackshipment() {
    System.out.println("268932");		
	}
}
