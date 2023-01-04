package simulasiFT01;

import java.util.Scanner;

public class SimFT04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan jumlah uang : ");
		int uang = scanner.nextInt();
		scanner.close();
		int hargaCokelat = 1000;
		int stempel = uang / hargaCokelat;
		int cokelat = 0;

		if (stempel >= 5) {
			cokelat += stempel + (stempel / 5);
			System.out.println("Nanda mendapatkan " + cokelat + " cokelat Dilan");
		} else {
			cokelat += stempel;
			System.out.println("Nanda mendapatkan " + cokelat + " cokelat Dilan");
		}
	}

}
