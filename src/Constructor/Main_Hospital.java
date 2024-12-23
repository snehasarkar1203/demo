package Constructor;

public class Main_Hospital {
	public static void main(String[] args) {
		Hospital s=new Hospital();
		s.setName("Neuron hospital");
		s.setlocation("Nagpur");
		s.setphoneno(878851519);
		s.setnoOfBeds(200);
		s.settype("neuro hospital");
		s.setisEmergency(true);
		
		String name=s.getName();
		String location=s.getlocation();
		long phoneno=s.getphoneno();
		int noOfBeds=s.getnoOfBeds();
		String type=s.gettype();
		boolean isEmergency=s.getisEmergency();
		
		System.out.println("name="+s.getName());
		System.out.println("location="+s.getlocation());
		System.out.println("phoneno="+s.getphoneno());
		System.out.println("noOfBeds="+s.getnoOfBeds());
		System.out.println("type="+s.gettype());
		System.out.println("isEmergency="+s.getisEmergency());
		
	}

}
