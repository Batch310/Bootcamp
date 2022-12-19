package day2.latihan;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
		int n = input.nextInt();
		int b = 1;
		for(int i=1;n>0;n--) {
			if(b%3==0) {
				System.out.print("* ");
			}
			else {
				System.out.print(i + " ");
			}
			i=i+4;
			b++;
		}

	}

}
