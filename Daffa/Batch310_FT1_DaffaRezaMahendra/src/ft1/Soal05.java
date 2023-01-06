package ft1;

import java.util.Scanner;

public class Soal05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Masukkan panjang n : ");
		int n = scanner.nextInt();
		System.out.println("Masukkan panjang m : ");
		int m = scanner.nextInt();

		if (n <= m) {
			int kub = m * m * 6;
			int pp = n * n;
			int hasil = kub / pp;
			System.out.println(hasil);
		} else {
			System.out.println("Tidak bisa membuat kubus");
		}
		scanner.close();
	}
}
