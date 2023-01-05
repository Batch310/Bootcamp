package _KUMPULAN_MATERI;

import java.util.Iterator;
import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("angka: ");
		int n = 3;
		int skorAlice = 0;
		int skorBob = 0;

		// i = alice
		// j = bob

		int[] arrayAlice = new int[n];
		int[] arrayBob = new int[n];

		for (int i = 0; i < n; i++) {
			arrayAlice[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			arrayBob[i] = scan.nextInt();
		}

		
		//perbandingan apakah skor
		for (int i = 0; i < n; i++) {
			if (arrayAlice[i] > arrayBob[i]) {
				skorAlice++;
			} else if (arrayBob[i] > arrayAlice[i]) {
				skorBob++;
			}

		}
		System.out.println();
		System.out.print(skorAlice + " " + skorBob);
	}
}
