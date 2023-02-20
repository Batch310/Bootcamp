package coba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTheTriplets {
	public static void main(String[] args) {
//		In this example:
//
//			Now, let's compare each individual score:
//
//			a[0] > b[0], so Alice receives  point.
//			a[0] = b[0], so nobody receives a point.
//					a[0] < b[0], so Bob receives  point.
//			Alice's comparison score is 1, and Bob's comparison score is 1. Thus, we return the array [1,1]
		
		Scanner masukan = new Scanner(System.in);	

		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			System.out.print("Masukkan nilai Alice: ");
			a.add(masukan.nextInt());
		}

		List<Integer> b = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			System.out.print("Masukkan nilai Bob: ");
			b.add(masukan.nextInt());
		}
		
		masukan.close();
		
		int aliceVal = 0;
		int bobVal = 0;
		
		List<Integer> result = new ArrayList<>(2);
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				aliceVal++;
			} else if (b.get(i) > a.get(i)) {
				bobVal++;
			}
		}
		
		result.add(0, aliceVal);
		result.add(1, bobVal);
		
		System.out.print("[" + result.get(0) + ", ");
		System.out.println(result.get(1) + "]");
	
	}
}
