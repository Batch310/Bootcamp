package day3.Warmupp;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("n: ");
		int n = scan.nextInt();

//		int n =2; 

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Angka: ");
			array[i] = scan.nextInt();
			// System.out.println(array[i]);
			int jumlah = array[i];

		}

		double positif = 0, negatif = 0, nol=0;
		for (int i = 0; i < n; i++) {
			if (array[i] >0)
				positif++;
			else if (array[i]<0) {
				negatif++;
			}else if (array[i]==0) {
				nol++;
			}
				
		}
		
		System.out.println();
		System.out.println();

		System.out.println(positif/n);
		System.out.println(negatif/n);
		System.out.println(nol/n);
	}

}
