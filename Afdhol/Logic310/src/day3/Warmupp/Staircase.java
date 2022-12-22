package day3.Warmupp;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {

		int n = 6;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("n: ");
//		n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i+j >= n-1) { //rumus 
	
					System.out.print("#");//cetak # nya

				}else {
					System.out.print(" "); //gunakan spasi agar rata kanan, karena IDE menampilkan dari kiri secara default
				}

			}
			System.out.println("");
		}
	}

}
