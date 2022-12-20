package day3.latihan;

import java.util.Scanner;

public class Soal6StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
		int n = input.nextInt();
		int s=1,p=1;
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				if(s<n) {
					System.out.print(" ");
					
				}
				else {
					System.out.print("#");
				}
				s++;
				
			}
			p++;
			s=p;
			System.out.println();
		}
	}

}
