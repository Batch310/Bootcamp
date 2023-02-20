package coba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthdayCakeCandles {
	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in);

		System.out.print("Masukkan banyak lilin: ");
		Integer n = masukan.nextInt();

//		System.out.print("Masukkan tinggi lilin: ");
//		masukan.nextLine();
//		String[] candles = masukan.nextLine().split(" ");
//		
//		Arrays.sort(candles, Collections.reverseOrder());
//		
//		Integer tallestCount = 0;
//		
//		for (int i = 0; i < candles.length; i++) {
//			if (candles[i].equals(candles[0])) {
//				tallestCount++;
//			}
//		}
//		
//		System.out.println(tallestCount);

		List<Integer> candles = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Masukkan tinggi lilin: ");
			candles.add(masukan.nextInt());
		}

		masukan.close();

		int count = 0;
		int maxHeight = 0;
		for (int i = 0; i < candles.size(); i++) {
			int height = candles.get(i);
			if (height > maxHeight) {
				maxHeight = height;
				count = 1;
			} else if (maxHeight == height) {
				count++;
			}
		}

		System.out.println(count);

//		List<Integer> candles = new ArrayList<>();
//
//		for (int i = 0; i < n; i++) {
//			System.out.print("Masukkan tinggi lilin: ");
//			candles.add(masukan.nextInt());
//		}
//
//		masukan.close();
////		
//		Collections.sort(candles, Collections.reverseOrder());  
//		
//		int tallestCount = 0;
//		
//		for (int i = 0; i < candles.size(); i++) {
//			if (candles.get(i) == candles.get(0)) {
//				tallestCount++;
//			}
//		}
//		
//		System.out.println(tallestCount);

//		Integer tallest = 0;
//		
//		Integer tallestCount = 0;
//		
//		for (int i = 0; i < candles.size(); i++) {
//			if (candles.get(i) > tallest) {
//				tallest = candles.get(i);			}
//		}
//		
//		for (int i = 0; i < candles.size(); i++) {
//			if (candles.get(i) == tallest) {
//				tallestCount++;
//			}
//		}
//		
//		System.out.println(tallestCount);

//		List<Integer> sortedCandles = candles.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		
//		Integer tallest = sortedCandles.get(0);
//		
//		Integer tallestCount = 0;
//		
//		for (int i = 0; i < sortedCandles.size(); i++) {
//			if (sortedCandles.get(i) == tallest) {
//				tallestCount++;
//			}
//		}
//		
//		System.out.println(tallestCount);

	}
}
