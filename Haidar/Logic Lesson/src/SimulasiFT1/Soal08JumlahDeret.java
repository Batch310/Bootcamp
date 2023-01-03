package SimulasiFT1;

import java.util.Scanner;

public class Soal08JumlahDeret {
	public static void main(String[] args) {
		////Deret kelipatan 3 dikurangi 1
		//Deret kelipatan 4 dibagi 2
		//Angka pada index ganjil saling dijumlahkan, begitu pula pada index genap
		//Index dimuali dari 0
		//Input berupa panjang deret
		//Cth Output = 1, 5, 9, 13, 17
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan panjang deret : ");
		int deret = masukan.nextInt();
		
//		int found = 0;
		int[] deretTiga = new int[deret];
		int[] deretEmpat = new int[deret];
		
		for (int i = 1; i <= deret; i++) {
			deretTiga[i-1] = ((i*3)-1);
			deretEmpat[i-1] = ((i*4)/2);
//			System.out.print(deretTiga[i-1] + " ");
//			System.out.print(deretEmpat[i-1] + " ");
			int jumlahDeret = deretTiga[i-1] + deretEmpat[i-1];
			if (i == deret) {
				System.out.print(jumlahDeret);
			} else {
				System.out.print(jumlahDeret + ", ");
			}
		}
		masukan.close();
	}
}
