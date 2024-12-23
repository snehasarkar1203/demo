package Basic;

public class patternW {
	public static void main(String[] args) {
		char[] letter= {'A','B','C','D','E'};
		for(int i=letter.length; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(letter[j]+"");
			}
			System.out.println();
		}	
	}
}
