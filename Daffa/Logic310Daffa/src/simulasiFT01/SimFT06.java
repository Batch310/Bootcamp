package simulasiFT01;

import java.util.Scanner;

public class SimFT06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan deret : ");
		int deret = scanner.nextInt();
		scanner.close();

		int tribo0 = 0;
		int tribo1 = 0;
		int tribo2 = 1;
		int found = 0;

		while (tribo2 < deret) {
			if (tribo2 % 2 != 0) {
				found++;
			}
			int nextTribo = tribo0 + tribo1 + tribo2;
			tribo0 = tribo1;
			tribo1 = tribo2;
			tribo2 = nextTribo;
		}
		System.out.println("Terdapat " + found + " bilangan ganjil");
	}

}
