package Interface;

public class Main_Fly {
	public static void main(String[] args) {
		Parent_Fly p=new Child_Aeroplane_fly();
		p.flyobject();
		Parent_Fly p1=new Child_Spacecraft_Fly();
		p1.flyobject();
	}

}
