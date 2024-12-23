package Interface;

public class Main_Play {
	public static void main(String[] args) {
		Parent_play p=new Child_Football_Play();
		p.play();
		Parent_play p1=new Child_Volleyball_Play();
		p1.play();
		Parent_play p2=new Child_Basketball_Play();
		p2.play();
	}

}
