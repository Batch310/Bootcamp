package day4.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		double negative = 0;
		double nol = 0;
		double positive = 0;
		
		int[]deret = new int[n];
		
		for (int i = 0; i < deret.length; i++) {
			System.out.print("Masukkan Angka Ke " +i+ ": ");
			deret[i] = input.nextInt();
		}
		
		//cetak array
		for (int i = 0; i < deret.length; i++) {
			System.out.print(deret[i] + " ");
		}
			
		for (int i = 0; i < deret.length; i++) {
			if (deret[i] < 0) {
				negative++;
			} else if (deret[i] == 0) {
				nol++;
			}else {
				positive++;
			}
			}
		double negativeproportion = negative/n;
		double nolproportion = nol/n;
		double positiveproportion = positive/n;
		
		System.out.println();
		System.out.println("Proporsi Bilangan Positif adalah : " +positiveproportion);
		System.out.println("Proporsi Bilangan Negatif adalah : " +negativeproportion);
		System.out.println("Proporsi Bilangan Nol adalah : " +nolproportion);
			}	
	}
