package catatan.untuk.FT1;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = scanner.nextInt();
		
		long a = 0;
		long b = 0;
		
		for (int i = 0; i < n; i++) { //01234
			System.out.print("Masukkan angka : "); //12345
			a = scanner.nextLong();
			b += a; // b = 15
		}
		System.out.print("Hasil = " +b);
		}		
	}