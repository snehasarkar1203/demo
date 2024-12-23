package Basic;

public class patternU {
	public static void main(String[] args) {
		char[] letter= {'1','2','3','4','5'};
		for(int i=letter.length; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(letter[j]+"");
			}
			System.out.println();
	}
	}
}
