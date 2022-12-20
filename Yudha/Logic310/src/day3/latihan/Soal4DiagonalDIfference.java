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
		int d1 = matrix[0][0]+matrix[1][1]+matrix[2][2];
		int d2 = matrix[0][2]+matrix[1][1]+matrix[2][0];
		int dd=0;
		if(d1>d2) {
			dd = d1-d2;
		}
		else {
			dd = d2-d1;
		}
		System.out.println(dd);
	}

}
