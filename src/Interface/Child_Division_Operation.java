package Interface;

public class Child_Division_Operation implements Parent_Operation{
	@Override
	public int calculate(int a,int b) {
	  int div=a/b;
	  return div;
}
}
