package day3.latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal4DiagonalDIfference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
		int n = input.nextInt();
		int[][] matrix= new int[n][n];
		int d1=0,d2=0,dd=0;
		System.out.println("Masukkan angka : ");
		for(int i=0; i<n;i++) {
			for(int j=0; j<n;j++) {
				int angka = input.nextInt();
				matrix[i][j] = angka;
			}
		}
		for(int i=0; i<n;i++) {
			for(int j=0; j<n;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int i=0,j=0,k=n-1; i<n; i++,j++,k--) {
			d1= d1+ matrix[i][j];
			d2 = d2+matrix[k][j];
		}
		dd = Math.abs(d1-d2);
		System.out.println(dd);
	}

}
