package simulasi.ft1;

import java.util.Scanner;

public class Soal3Kelipatan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// x deret kelipatan 5 5,10,15
		// y deret kelipatan 8 8,16,24

		// buat deret sepanjang n dimana bilangannya ada di x dan y

//		Scanner scan = new Scanner(System.in);
//		System.out.println("n: ");
//		int input = scan.nextInt();

//		int input = 5;
//		int x = 0;
//		int y = 0;
//		int[] arrX;
//		int[] arrY;
//
//		for (int i = 1; i <= input; i++) {
//			x = i * 5;
//			System.out.print(x + " ");
//			arrX = new int[x];
//		}
//		for (int j = 1; j <= input; j++) {
//			y = j * 8;
//			System.out.print(y + " ");
//			arrY = new int[y];
//		}
//
//		System.out.println();

		
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
