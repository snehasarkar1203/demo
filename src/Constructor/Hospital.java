package Constructor;

public class Hospital {
	private String name;
	private String location;
	private long phoneno;
	private int noOfBeds;
	private String type;
	private boolean isEmergency;
	
	void setName(String n) {
		name=n;
		}
	String getName() {
		return name;
	}
	void setlocation(String l) {
		location=l;
	}
	String getlocation() {
		return location;
	}
	void setphoneno(long d) {
		phoneno=d;
	}
	long getphoneno() {
		return phoneno;
	}
	void setnoOfBeds(int i) {
		noOfBeds=i;
	}
	int getnoOfBeds() {
		return noOfBeds;
	}
	void settype(String t) {
		type=t;
	}
	String gettype() {
		return type;
	}
	void setisEmergency(boolean b) {
		isEmergency=b;
	}
	boolean getisEmergency() {
		return isEmergency;
	}
	
}
