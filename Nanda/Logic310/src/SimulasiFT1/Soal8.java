package SimulasiFT1;

import java.util.Scanner;

public class Soal8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan Panjang Array : ");
		int n = input.nextInt();

		int k30 = 2;
		int k31 = k30 + 3;

		int[] deret3 = new int[n];
		deret3[0] = k30;
		deret3[1] = k31;

		System.out.print("Deret 3 : ");
		for (int i = 2; i < n; i++) {
			deret3[i] = k31 + 3;
			k30 = k31;
			k31 = deret3[i];
		}
		for (int i = 0; i < deret3.length; i++) {
			System.out.print(deret3[i] + " ");
		}

		System.out.println();

		int k40 = 2;
		int k41 = k40 + 2;

		int[] deret4 = new int[n];
		deret4[0] = k40;

		System.out.print("Deret 4 : ");
		for (int i = 1; i < n; i++) {
			deret4[i] = k41 + 2;
			k40 = k41;
			k41 = deret4[i];
		}
		for (int i = 0; i < deret3.length; i++) {
			System.out.print(deret4[i] + " ");

		}

		System.out.println();

		System.out.print("Total : ");
		int[] total = new int[n];
		for (int i = 0; i < n; i++) {
			total[i] = deret3[i] + deret4[i];
			System.out.print(total[i] + " ");
		}
	}
}