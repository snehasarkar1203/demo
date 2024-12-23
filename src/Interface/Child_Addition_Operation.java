package Interface;

public class Child_Addition_Operation implements Parent_Operation{
@Override
public int calculate(int a,int b) {
  int sum=a+b;
  return sum;
  
}
}
