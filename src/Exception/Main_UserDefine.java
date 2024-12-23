package Exception;

public class Main_UserDefine {
	void m1()throws UserDefine{
		throw new UserDefine(" user defined Exception");
	}
	public static void main(String[] args) {
		Main_UserDefine m=new Main_UserDefine();
		try {
			m.m1();
		}catch(UserDefine e) {
			System.out.println(e.getMessage());
		}
	}

}
