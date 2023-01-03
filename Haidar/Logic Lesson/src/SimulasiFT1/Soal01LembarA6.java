package SimulasiFT1;

import java.util.Scanner;

public class Soal01LembarA6 {
	public static void main(String[] args) {
		//0<x<6
		//Misal input x = 5, output = Dibutuhkan 2 kertas A6 untuk membuat selembar kertas A5
		//Misal input x = 4, output = Dibutuhkan 4 kertas A6 untuk membuat selembar kertas A4
		Scanner masukan = new Scanner(System.in);
		
		System.out.println("Masukkan nilai x : ");
		int kertasX = masukan.nextInt();
		while (kertasX < 1 || kertasX > 6) {
			System.out.println("Input tidak valid!");
			System.out.println("Masukkan nilai x : ");
			kertasX = masukan.nextInt();
		}
		int lembar = (int) (2*Math.pow(2, 5-kertasX));
		
		System.out.println("Dibutuhkan " + lembar + " kertas A6 untuk membuat selembar kertas A" + kertasX);
		masukan.close();
		
	}
}

//A1 = 2*A2; A2=2*A3; A3=2*A4; A4=2*A5; A5=2*A6
//A1 = 2*(2*2*(2*2(A6)