package day2.latihan;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
		int n = input.nextInt();
		int x = 0,y=0;
		if(n%2!=0) {
			x = (n/2)+1;
			for(int i=3;n>0;n--) {
				if(n==x) {
					System.out.print("XXX ");
				}
				else {
					System.out.print(i + " ");
				}
				i=i*3;
			}
		}
		else {
			x = n/2;
			y = n/2+1;
			for(int i=3;n>0;n--) {
				if(n==x | n==y) {
					System.out.print("XXX ");
				}
				else {
					System.out.print(i + " ");
				}
				i=i*3;
			}
		}
		

	}

}
