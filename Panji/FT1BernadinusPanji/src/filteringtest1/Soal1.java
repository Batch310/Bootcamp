package filteringtest1;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Input uang Bambang Rp.");
		int uang = input.nextInt();

		//int tukar = (uang / 5) / 1000;
		//int es = (uang / 1000) + tukar;
		int hargaEs = 1000;
		int esBonus = 0;
		int esBaru = 0;
		int esBaru1 = 0;

		for (int i = 0; i < (uang / hargaEs); i++) {
			esBonus++;
			if (esBonus % 5 == 0) {
				esBaru = 0;
				esBaru1++;
				esBaru++;

			}

		}

		int esTotal = esBaru + esBonus + esBaru1;
		System.out.println("Jumlah es loli yang didapatkan Bambang adalah " + esTotal + " es loli");

	}

}
