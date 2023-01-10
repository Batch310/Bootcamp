package simulasift1;

import java.util.Scanner;

public class Soal03Kelipatan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// x=5 5,10,15 ....
		// y=8 5,16,24 ....
		// n = 5 n=3
		// outuput 40 80 120 160 40 80 120

		System.out.print("Input n = ");
		int n = input.nextInt();

		int[] arr = new int[n];

		
		int nilaiAwal = 5;
		for (int index = 0; index < arr.length; nilaiAwal+=5) {
			if (nilaiAwal % 5 == 0 && nilaiAwal % 8 == 0) {
				arr[index] = nilaiAwal;
				index++;
			}
		}

		for (int i : arr) {
			System.out.println(i+" ");
		}

	}

}
