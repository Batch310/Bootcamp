package coba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {

//		4
//		 -1  1 -7 -8
//		-10 -8 -5 -2
//		  0  9  7 -1
//		  4  4 -2  1
//		  -1 - 0

		Scanner masukan = new Scanner(System.in);

		System.out.print("Masukkan ordo matriks: ");
		Integer ordo = masukan.nextInt();

		List<List<Integer>> arr = new ArrayList<>();

		int lrdiagonal = 0;
		int rldiagonal = 0;

		for (int i = 0; i < ordo; i++) {
			List<Integer> ar = new ArrayList<>();
			for (int j = 0; j < ordo; j++) {
				System.out.print("Masukkan bilangan pada index ke-" + i + "" + j + ": ");
				ar.add(masukan.nextInt());
			}
			arr.add(ar);
		}
		
		masukan.close();

		System.out.println(arr);

		for (int i = 0; i < ordo; i++) {
			for (int j = 0; j < ordo; j++) {
//				System.out.print(arr.get(i).get(j) + " ");
				if (i == j) {
					System.out.println("hasil lr: " + (arr.get(i).get(j)));
					lrdiagonal += arr.get(i).get(j);
				}

				if (i + j == (ordo - 1)) {
					System.out.println("hasil rl: " + (arr.get(i).get(j)));
					rldiagonal += arr.get(i).get(j);
				}
			}
//			System.out.println();
		}

		System.out.println(Math.abs(lrdiagonal - rldiagonal));
//		System.out.println(arr.size());
//		System.out.println(lrdiagonal);
//		System.out.println(rldiagonal);

	}
}
