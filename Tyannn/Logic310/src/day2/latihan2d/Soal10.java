package day2.latihan2d;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("n = ");
		int n = input.nextInt();
		
		System.out.print("n2 = ");
		int n1 = input.nextInt();

		int awal= 0;
		int awal1=0;

		for (int i = 0; i < n1; i++) {
			for (int j = i * n; j < (i + 1) * n; j++) {
				if(i==0) {
					System.out.print(j+" ");
				}else if(i==1) {
					System.out.print(awal+" ");
					awal+=3;
				}else {
					System.out.print(awal1+" ");
					awal1 +=4;
					
				}
			}
			System.out.println();
		}
	}

}
