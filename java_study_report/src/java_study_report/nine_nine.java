package java_study_report;

public class nine_nine {
	public static void main(String[] args) {
		int i;
		int j;
		
		for(i = 1; i < 10;i++) {
			for(j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}	
	}

}
