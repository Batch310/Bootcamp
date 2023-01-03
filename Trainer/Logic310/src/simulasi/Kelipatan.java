package simulasi;

import java.util.Scanner;

public class Kelipatan {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input n : ");
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		int index = 0; //Variabel yang bertugas sebagai index variabel array
		
		int nilaiAwal = 5; //Nilai awal dari kelipatan terkecil
		while(index < n) { //Berhenti jika indexnya sudah lebih dari n-1
			if(nilaiAwal % 5 == 0 && nilaiAwal % 8 == 0) {
				array[index] = nilaiAwal; //Masukkan ke array jika habis dibagi 5 & 8
				index++; //Tambah Indexnya
			}
			nilaiAwal = nilaiAwal + 5; //Tambah 5 karena 5 adalah kelipatan terkecil
		}
		
		for (int i : array) {
			System.out.print(i + " ");
		}
		
	}
}
