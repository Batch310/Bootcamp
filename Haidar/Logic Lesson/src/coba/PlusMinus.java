package coba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan banyaknya data: ");
		Integer n = masukan.nextInt();
		
		List<Integer> arr = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Masukkan angka: ");
			arr.add(masukan.nextInt());
		}
		
		masukan.close();
		
		float positiveVal = 0;
		float negativeVal = 0;
		float zeroVal = 0;
		
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0) {
				positiveVal++;
			} else if (arr.get(i) < 0) {
				negativeVal++;
			} else {
				zeroVal++;
			}
		}
		
		System.out.println(positiveVal / arr.size());
		System.out.println(negativeVal / arr.size());
		System.out.println(zeroVal / arr.size());
		
	}
}
