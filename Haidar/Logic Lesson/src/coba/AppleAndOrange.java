package coba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleAndOrange {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan nilai s: ");
		Integer s = masukan.nextInt();

		System.out.print("Masukkan nilai t: ");
		Integer t = masukan.nextInt();

		System.out.print("Masukkan nilai a: ");
		Integer a = masukan.nextInt();
		
		System.out.print("Masukkan nilai b: ");
		Integer b = masukan.nextInt();

		System.out.print("Masukkan nilai m: ");
		Integer m = masukan.nextInt();
		
		System.out.print("Masukkan nilai n: ");
		Integer n = masukan.nextInt();
		
		List<Integer> apples = new ArrayList<>();
		List<Integer> oranges = new ArrayList<>();
		
		for (int i = 0; i < m; i++) {
			System.out.print("Masukkan nilai jarak setiap m: ");
			apples.add(masukan.nextInt());
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print("Masukkan nilai jarak setiap n: ");
			oranges.add(masukan.nextInt());
		}
		
		Integer applesCount = 0;
		Integer orangesCount = 0;
		
		masukan.close();
		//======================================================================
		
		for (int i = 0; i < apples.size(); i++) {
			if (a + apples.get(i) >= s && a + apples.get(i) <= t) {
				applesCount++;
			}
		}
		
		for (int i = 0; i < oranges.size(); i++) {
			if (b + oranges.get(i) >= s && b + oranges.get(i) <= t) {
				orangesCount++;
			}
		}
		
		System.out.println(applesCount);
		System.out.println(orangesCount);
		
	}
}
