package Interface;

public class Child_Subtract_Operation implements Parent_Operation {
	@Override
	public int calculate(int a,int b) {
	  int sub=a-b;
	  return sub;
}
}
