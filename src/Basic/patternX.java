package Basic;

public class patternX {
	public static void main(String[] args) {
		char startLetter='A';
		int row =5;
		for(int i=0; i<row; i++) {
			for(int j=row-i; j>0; j--) {
				System.out.print((char)(startLetter + i)+"");
			}
			System.out.println();
		}
	}

}
