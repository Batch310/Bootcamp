package day2.latihan2d;

import java.util.Scanner;

public class Soal9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n= input.nextInt();
		System.out.print("n = ");
		int n1= input.nextInt();

		
		int awal = 0;
		int awal1 = 0;

		
		for(int i= 0;i<n1;i++ ) {
			for(int j = i*n; j<(i+1)*n; j++) {
				if(i==0) {
					System.out.print(j+" ");
				}else if(i==1) {
					System.out.print(awal+" ");
					awal+=3;
				}else if(i==2) {
					awal-=3;
					System.out.print(awal+" ");
					
				}
				
			}
			System.out.println();
		}
	
	}
}
