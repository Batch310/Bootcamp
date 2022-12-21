package day3.warmup;

import java.util.Scanner;

public class WarmUp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Berapa lilin? ");
		int lilin = input.nextInt();
		int[] tinggiLilin = new int[lilin];
		int tertinggi = 0;
		int total = 0;
		
		for (int i = 0; i < lilin; i++) {
			System.out.print("Tinggi lilin : ");
			tinggiLilin[i] = input.nextInt();
		}
		
		for (int i = 0; i < tinggiLilin.length; i++) {
			for (int j = 0; j < tinggiLilin.length; j++) {
				if (tinggiLilin[j] > tertinggi) {
					tertinggi = tinggiLilin[j];
				}
			}
			if(tinggiLilin[i]==tertinggi) {
				total++;
			}
		}
		System.out.println(total);
	}
}