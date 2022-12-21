package day3.warmup;

import java.util.Scanner;

public class WarmUp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Berapa lilin? ");
		int lilin = input.nextInt();
		int[] arrLilin = new int[lilin];
		int tertinggi = 0;
		int total = 0;
		
		for (int i = 0; i < lilin; i++) {
			System.out.print("Tinggi lilin : ");
			arrLilin[i] = input.nextInt();
		}
		
		for (int i = 0; i < arrLilin.length; i++) {
			for (int j = 0; j < arrLilin.length; j++) {
				if (arrLilin[j] > tertinggi) {
					tertinggi = arrLilin[j];
				}
			}
			if(arrLilin[i]==tertinggi) {
				total++;
			}
		}
		System.out.println(total);
	}

}