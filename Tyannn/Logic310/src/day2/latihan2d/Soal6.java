package day2.latihan2d;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		int awal = 1;
		int awal1 = 1;
		int awal2= 1;

		for (int i = 0; i < 3; i++) {
			for (int j = 0 ; j < n; j++) {
				if(i==0) {
					System.out.print(j+" ");
					
				}else if(i==1) {
					System.out.print(awal1+" ");
					awal1 *= n;
				}else {
					System.out.print(awal2+" ");
					awal = awal + n;
					awal2 = awal;
				}
			}
			System.out.println();
			
		}
	}

}
