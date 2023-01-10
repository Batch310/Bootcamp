package FT1;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukkan Panjang Sisi Persegi dalam cm : ");
		int n = scanner.nextInt();
		
		System.out.print("Masukkan Panjang Rusuk Kubus dalam cm : ");
		int m = scanner.nextInt();
		
		double Lpersegi = (int) Math.pow(n, 2); // n =1
		
		double LPkubus = (int) Math.pow(m, 2) * 6; // m = 54
				
		double hasil = Math.ceil(LPkubus / Lpersegi); // 54
		
		System.out.print("Banyaknya persegi adalah : " + hasil);
	}

}