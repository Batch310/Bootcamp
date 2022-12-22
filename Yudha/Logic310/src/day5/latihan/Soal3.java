package day5.latihan;

import java.util.Iterator;
import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input n : ");
		int n = input.nextInt();
		int angka = 100;
		for (int i = 0; i < n; i++) {
			String stringAngka = ""+angka;
			String[] arrayAngka = stringAngka.split("");
			//System.out.println(stringAngka);
			int a = 0,sum=0;
			for(int j = 0; j < arrayAngka.length; j++) {
				a = Integer.parseInt(arrayAngka[j]);
				a = (int)Math.pow(a, 2);
				sum = sum + a;
				System.out.println(a);
				System.out.println("sum :"+ sum);

				while(sum>=10) {
					String stringSum = ""+sum;
					System.out.println(stringSum);
					String[] arraySum = stringSum.split("");
					a = 0;
					sum=0;
					for (int k = 0; k < arraySum.length; k++) {
						a = Integer.parseInt(arraySum[k]);
						a = (int)Math.pow(a, 2);
						sum = sum + a;
						System.out.println(a);
						System.out.println("sum :"+ sum);
					}
				}
				angka++;

			}
			
			if(sum==1) {
				System.out.println(stringAngka+" adalah Si Angka 1");
			}
		}
		
	}

}
