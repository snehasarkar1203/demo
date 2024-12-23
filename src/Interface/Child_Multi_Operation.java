package Interface;

public class Child_Multi_Operation implements Parent_Operation{
	@Override
	public int calculate(int a,int b) {
	  int product=a*b;
	  return product;
}
}
