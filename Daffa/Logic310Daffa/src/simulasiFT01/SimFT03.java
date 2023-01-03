package simulasiFT01;

import java.util.Iterator;
import java.util.Scanner;

public class SimFT03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan deret : ");
		int deret = scanner.nextInt();
		scanner.close();
		
		int found = 0;
		for (int i = 1; found < deret; i++) {
			if (i % 5 == 0) {
				if (i % 8 == 0) {
					found++;
					System.out.print(i + " ");
				}
			}
		}
	}

}
