package simulasi.ft1;

import java.util.Scanner;

public class Soal01_LembarKertas {

	public static void main(String[] args) {

		// 5 -> 2^ (6-5
		// 4 -> 4^ (6-4
		// 3 -> 8^ (6-3
		// 2 ->
		// 1 ->

		Scanner inputan = new Scanner(System.in);
		System.out.print("Masukkan x = ");
		int x = inputan.nextInt();

		int hasil = (int) Math.pow(2, 6 - x);

		System.out.println("Dibutuhkan " + hasil + " kertas A6 " + "untuk membuat selembar kertas A" + x);

	}

}
