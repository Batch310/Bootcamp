package day2.latihan2;

import java.util.Scanner;

public class Soal4 {

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
		int x=0,y=0;
		for(int i = 0; i<n; i++) {
			if(i%2==0) {
				x++;
				System.out.print(x +"\t");
				
			}
			else {
				y=x*n2;
				System.out.print(y +"\t");
			}
			
		}
//		int x=0;
//		if(x%2==0) {
//			System.out.println("True");
//		}
	}

}
