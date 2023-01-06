package ft1;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan panjang deret : ");
		int deret = scanner.nextInt();
		scanner.close();
		int[] deretTiga = new int[deret];
		int[] deretEmpat = new int[deret];
		
		String deret3 = "";
		String deret4 = "";

		for (int i = 1; i <= deret; i++) {
			deretTiga[i-1] = ((i * 3) - 1);
			deretEmpat[i-1] = ((i * 4) / 2);
			deret3 += deretTiga + " ";
			deret4 += deretEmpat + " ";

			int jumlahDeret = deretTiga[i-1] + deretEmpat[i-1];
			if (i == deret) {
				System.out.print(jumlahDeret);
			} else {
				System.out.print(jumlahDeret + ", ");
			}
		}
		
		String[] arrDeret3 = deret3.split(" ");
		String[] arrDeret4 = deret4.split(" ");
		
		for (int i = 0; i < arrDeret3.length; i++) {
			System.out.print(deret3 + " ");
		}
		for (int i = 0; i < arrDeret4.length; i++) {
			System.out.print(deret4 + " ");
		}
		
	}
}
