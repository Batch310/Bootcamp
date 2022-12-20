package day3.latihan;

import java.util.Scanner;

public class Soal5PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
		int n = input.nextInt();
		double plus=0,minus=0,nol =0;
		int [] deret = new int[n];
		System.out.println("Masukkan angka : ");
		for(int i=0; i<n;i++) {
			int angka = input.nextInt();
			deret[i] = angka;
			if(angka==0) {
				nol++;
			}
			else if(angka>0) {
				plus++;
			}
			else {
				minus++;
			}
		}
		for(int i=0; i<n;i++) {
			System.out.print(deret[i]+" ");
		}
		System.out.println();
		System.out.println(plus/n);
		System.out.println(minus/n);
		System.out.println(nol/n);

	}

}
