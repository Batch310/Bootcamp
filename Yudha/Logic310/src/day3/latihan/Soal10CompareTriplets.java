package day3.latihan;

import java.util.Scanner;

public class Soal10CompareTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
		int n = input.nextInt();
		int[] a= new int[n];
		int[] b= new int[n];
		int angka,pointA=0,pointB=0;
		for(int i=0; i<2;i++) {
			for(int j=0;j<n;j++) {
				if(i==0) {
					System.out.print("Masukkan a ke- "+j + " : ");
					angka = input.nextInt();
					a[j] = angka;
				}
				else {
					System.out.print("Masukkan b ke- "+j + " : ");
					angka = input.nextInt();
					b[j] = angka;
				}
			}
		}
		for(int i=0; i<n;i++) {
			System.out.print(a[i]+" ");
			if(a[i]>b[i]) {
				pointA++;
			}
			else if(a[i]<b[i]) {
				pointB++;
			}
			else {
				
			}
		}
		System.out.println();
		for(int i=0; i<n;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println(pointA + " " + pointB);
	}

}
