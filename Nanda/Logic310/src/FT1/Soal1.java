package FT1;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("n = ");
		int n = input.nextInt();

		int eslolibonus = 0;
		int stik = 0;
		int harga = 1000;
		int esloli = 0;
		int eslolitotal = 0;
		int eslolinew = 0;

		for (esloli = 0; esloli < (n / harga); esloli++) {
			stik++;
			if (stik % 5 == 0 && stik > 0) {
				eslolinew = 0;
				eslolibonus++;
				eslolinew++;				
			}
		}
		eslolitotal = esloli + eslolibonus + eslolinew;
		System.out.print("Bambang mendapatkan " + eslolitotal + " es loli");
	}

}
