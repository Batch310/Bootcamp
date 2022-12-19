package day2.latihan;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
		int n = input.nextInt();
		for(int i=1;n>0;i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
				n--;
				
			}
		}

	}

}
