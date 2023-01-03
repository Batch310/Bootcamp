package simulasiFT1;

import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n : ");
		int saldo = input.nextInt();

		int hargaCoklat = 1000;
		int stempel = saldo / hargaCoklat;
		int coklat = 0;

		if (stempel >= 5) {
			coklat = coklat + stempel + (stempel / 5);
			System.out.println("Nanda mendapatkan " + coklat + " cokelat dilan");
		} else {
			coklat = coklat + stempel;
			System.out.println("Nanda mendapatkan " + coklat + " cokelat dilan");
		}
	}
}
