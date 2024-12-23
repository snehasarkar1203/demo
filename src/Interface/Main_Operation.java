package Interface;

public class Main_Operation {
	public static void main(String[] args) {
		Parent_Operation p=new Child_Addition_Operation();
		 int add=p.calculate(4,2);
		 System.out.println(add);
		Parent_Operation p1=new Child_Subtract_Operation();
		 int sub=p1.calculate(8, 9);
		 System.out.println(sub);
		Parent_Operation p2=new Child_Multi_Operation();
		 int product=p2.calculate(6, 3);
		 System.out.println(product);
		Parent_Operation p3=new Child_Division_Operation();
		 int div=p3.calculate(4, 9);
		 System.out.println(div);
		 
		
		
			
	}
	}

