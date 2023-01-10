package simulasift1;

import java.util.Scanner;

public class Soal01SelembarKertas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Ada berapa lembar kertas A6 untuk membuat selembar kartas Ax?
		//Contoh output
		//5 -> 2 ==> 2^(6-5)
		//4 -> 4 ==> 2^(6-4)
		//3 -> 8 ==> 2^(6-3)
		//2 -> 16 ==> 2^(6-2)
		//1 -> 32 ==> 2^(6-1)

		System.out.print("input x : ");
		int x = input.nextInt();

//		double a6 = 2*x;
		int hasil = (int) Math.pow(2, 6 - x);

		System.out.println("Dibutuhkan " + hasil + " kertas A6 untuk membuat kertas A" + x);
	}

}
