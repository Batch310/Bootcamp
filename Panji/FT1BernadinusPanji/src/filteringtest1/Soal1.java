package filteringtest1;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Input uang Bambang Rp.");
		int uang = input.nextInt();

		int tukar = (uang / 5) / 1000;
		int es = (uang / 1000) + tukar;

		System.out.println("Jumlah es loli yang didapatkan Bambang adalah " + es + " es loli");

	}

}
