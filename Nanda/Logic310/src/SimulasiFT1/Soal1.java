package SimulasiFT1;

import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("X = ");
		int X = input.nextInt();
		
		int a6 = 1;
		int a5 = 2*a6;
		int a4 = 2*a5;
		int a3 = 2*a4;
		int a2 = 2*a3;
		int a1 = 2*a2;
		
		if(X==5) {
			System.out.print("Dibutuhkan " +a5+ " Kertas A6 untuk membuat selembar kertas A5");
		}else if (X==4) {
			System.out.print("Dibutuhkan " +a4+ " Kertas A6 untuk membuat selembar kertas A4");
		}else if (X==3) {
			System.out.print("Dibutuhkan " +a3+ " Kertas A6 untuk membuat selembar kertas A3");
		}else if (X==2) {
			System.out.print("Dibutuhkan " +a2+ " Kertas A6 untuk membuat selembar kertas A2");
		}else if (X==1) {
			System.out.print("Dibutuhkan " +a1+ " Kertas A6 untuk membuat selembar kertas A1");
		}else {
			System.out.print("Masukkan X : 1-5");
		}
		
	}

}
