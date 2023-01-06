package _KUMPULAN_MATERI;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {

 
//
//		System.out.println();   
//		for (i = 0; i < m; i++)   
//		{   
//		for (j = 0; j < m; j++)   
//
//		System.out.print(array[i][j] + " ");   
//
//		System.out.println();   
//		}  
		
		int n;

		Scanner scan = new Scanner(System.in);
		System.out.println("n: ");
		n = scan.nextInt();


		int[][] arr = new int[n][n];

		System.out.println("Angka: ");
		
		for (int i = 0; i < n; i++) 
			for (int j = 0; j < n; j++) 
		arr[i][j]= scan.nextInt();
			
		//menampilkan
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { // [i] agar tidak error untuk 
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//menghitung jumlah diagonal \ dan diagonal /
		
		int diagonal1 = 0;
		int diagonal2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i==j) {
					diagonal1=diagonal1+arr[i][j];
				}
				if (i+j==n-1) {
					diagonal2=diagonal2+arr[i][j];
				}
			}
		}
		
		//menghitung nilai absolut(untuk selisih dg hasil selalu positif)
		int hasil = Math.abs(diagonal2-diagonal1);
		System.out.println("Hasil: "+hasil);
		
	}

}
