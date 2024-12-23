package Mock_Test;

public class Mock_4 {
public static void main(String[] args) {
	int i = 1,j,k,row=13;
	for (i= 1; i <=row; i++) {
		for ( j= 0; j <row; j++) {
			System.out.print("");	
		}
		for(k=1;k<=(2*i-1);k++){
			if(k==1 || i== row || k==(2*i-1)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println("");
}
	}

}
