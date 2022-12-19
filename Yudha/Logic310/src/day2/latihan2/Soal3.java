package day2.latihan2;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan n  : ");
		int n = input.nextInt();
		System.out.print("Masukkan n2 : ");
		int n2 = input.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		int x=0;
		for(int i = 1; i<=n; i++) {
			System.out.print(n2 + "\t");
			if(x<n/2) {
				n2 = n2*2;
			}
			else {
				n2=n2/2;
			}
			x++;
		}

	}

}
