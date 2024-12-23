package Mock_Test;

import java.util.ArrayList;

public class Mock_8 {
public static void main(String[] args) {
	int[] array= {1,2,3,4,5,6,7,8,9,10};
	ArrayList<Integer>evenElement=new ArrayList<>();
	for(int num: array) {
		if(num%2==0) {
			evenElement.add(num);
		}
	}
	System.out.println("Even Element:"+ evenElement);
}
}
