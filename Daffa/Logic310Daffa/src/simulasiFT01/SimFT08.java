package simulasiFT01;

import java.util.Scanner;

public class SimFT08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan panjang deret : ");
		int input = scanner.nextInt();
		scanner.close();

		int[] deret3 = new int[input];
		int[] deret4 = new int[input];

		for (int i = 1; i <= input; i++) {
			deret3[i - 1] = ((i * 3) - 1);
			deret4[i - 1] = ((i * 4) / 2);
			int jumlah = deret3[i - 1] + deret4[i - 1];
			if (i == input) {
				System.out.print(jumlah);
			} else {
				System.out.print(jumlah + ", ");
			}
		}

	}
}