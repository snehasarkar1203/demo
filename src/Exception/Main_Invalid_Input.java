package Exception;

public class Main_Invalid_Input {
	void checkinput(String input)throws Invalid_Input{
		if(input==null) {
		throw new Invalid_Input("Invalid Input Exception");
	}
	}
	public static void main(String[] args) {
		Main_Invalid_Input m=new Main_Invalid_Input();
		try {
			m.checkinput(null);
		}catch(Invalid_Input e) {
			System.out.println(e.getMessage());
		}
		}
}
