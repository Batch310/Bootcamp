package materiku.soal;

import java.util.Scanner;

public class Soal08_primaFibo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Panjang deret = ");
		int n = scanner.nextInt();

		// Bilangan Prima
		int[] arrP = new int[n];

		int found = 0; //data yg sudah ditemukan
		int bil = 2;  //angka yang dicek

		while (found < n) {
			boolean prima = true;
			for (int j = 2; j <= bil / 2; j++) { // cek bil prima( /1 dan bil/bil)
				if (bil % j == 0) { // cek bukan prima
					prima = false;
					break;
				}
			}
			if (prima) {     //masukkan ke Array  
				arrP[found] = bil;
				found++;
			}
			bil++;
		}
		for (int prima : arrP) {
			System.out.print(prima + " ");
		}

	System.out.println();
	

//		System.out.println();

		// Bilangan Fibonacci
		int[] arrF = new int[n];

//		// fibonnaci n = -N + -n1
//		// 0,1,1,2,3,5,8,12
//		// 2 = -2 + -1
//
		int bilSebelum  = 1;
		int cur = 0;
        int fibo = 1;
        int arrFibo = 0 ;
		
		for (int i = 0; i < arrF.length; i++) {

			arrF[arrFibo] = cur;
			fibo = bilSebelum + cur;
			bilSebelum = cur;
			cur = fibo;
			 arrFibo++;
		}

		for (int i : arrF) {
			System.out.print(i + " ");
		}
        
		System.out.println();
		System.out.println("----------------");

		int[] arrSum = new int[n];
		// cetak (prima + fibo) sesuai indekx
		for (int i = 0; i < arrF.length; i++) {

			arrSum[i] = arrP[i] + arrF[i];
		}

		for (int i : arrSum) {
			System.out.print(i + ", ");
		}

	}

}
