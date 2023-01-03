package simulasi.ft1;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("x: ");
		int input = scan.nextInt();


	
		if (input == 1) {
		int hasil = (input+1)*16;
		System.out.println("Dibutuhkan "+hasil+" kertas A6 untuk membuat selembar kertas A"+input);
			
		}
		if (input == 2) {
		int hasil = (input-0)*8;
		System.out.println("Dibutuhkan "+hasil+" kertas A6 untuk membuat selembar kertas A"+input);
				
		}
		if (input == 3) {
		int hasil = (input-1)*4;
		System.out.println("Dibutuhkan "+hasil+" kertas A6 untuk membuat selembar kertas A"+input);
			
		}
		if (input == 4) {
		int hasil = (input-2)*2;
		System.out.println("Dibutuhkan "+hasil+" kertas A6 untuk membuat selembar kertas A"+input);
			
		}
		if (input == 5) {
		int hasil = input-3;
		System.out.println("Dibutuhkan "+hasil+" kertas A6 untuk membuat selembar kertas A"+input);
		}
		else if (input<1&&input>5) {
			System.exit(0);
		}

	}

}
