package Project;

public class Pair_Sum_5 {
	public static void pairs(int a[],int k) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if((a[i]+a[j])==k) {
					System.out.println("pairs sum of number is= "+a[i]+"+"+a[j]+"=7");
				}
				
			}
			
		}
	}

}
