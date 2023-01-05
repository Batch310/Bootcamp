package catatan.untuk.FT1;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSUMsimple {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] deret = new int[5];
		
		for (int i = 0; i < deret.length; i++) {
			System.out.print("masukkan angka :  ");
			deret[i] = input.nextInt();
		}
		
		System.out.println();
		System.out.println();
		//cetak
		for (int i = 0; i < deret.length; i++) {
			System.out.print(deret[i] + " ");
		}
		//Cara 2, Sorting Ascending
		Arrays.sort(deret);
		
		int min = deret[0] + deret[1] + deret[2] + deret[3];
		int max = deret[1] + deret[2] + deret[3] + deret[4];
		
		System.out.println();
		System.out.println(min);
		System.out.println(max);
	}
}
