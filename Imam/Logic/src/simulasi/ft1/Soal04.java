package simulasi.ft1;

import java.util.Scanner;

public class Soal04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan n = ");
		int n = scanner.nextInt();

		int hargaCoklat = 1000;
		int stempel = 0;
		int coklat = 0;

		coklat = n / hargaCoklat;

		stempel = coklat / stempel;

		if (stempel == 5) {
			coklat += 1;
		}if else (
				){
			
		}

		System.out.println("Nanda Mendapatkan " + coklat + "Coklat dilan");

	}

}
