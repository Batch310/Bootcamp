package simulasift1;

import java.util.Scanner;

public class soal3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// x=5 5,10,15 ....
		// y=8 5,16,24 ....
		// n = 5						n=3
		// outuput 40 80 120 160		40 80 120
		
		
		int n = 5;

		int x = 5;
		int y = 8;
		
		for(int i=1; i<=n; i++) {
			x = x * 2;
			System.out.print(x+" ");
		}
		
		System.out.println();
		for(int i=1; i<=n; i++) {
			y = y * 2;
			System.out.print(y+" ");
		}
		
		if(x==y) {
			
		}
	}

}
