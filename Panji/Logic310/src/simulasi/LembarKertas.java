package simulasi;

import java.util.Scanner;

public class LembarKertas {
	public static void main(String[] args) {
		//Contoh output
		//5 -> 2 ==> 2^(6-5)
		//4 -> 4 ==> 2^(6-4)
		//3 -> 8 ==> 2^(6-3)
		//2 -> 16 ==> 2^(6-2)
		//1 -> 32 ==> 2^(6-1)
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input X : ");
		int x = scanner.nextInt();
		
		//Cara 1
//		int angkaBantu = x;
//		int hasil = 1;
//		while(angkaBantu < 6) { 
//			hasil = hasil * 2;
//			angkaBantu++;
//		}
		
		//Cara 2
		int hasil = (int) Math.pow(2, 6-x);
		
		System.out.println("Dibutuhkan " + hasil + " kertas A6 untuk membuat kertas A" + x);
	}
}