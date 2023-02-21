package coba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BreakingTheRecords {
	public static void main(String[] args) {
		
		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan jumlah game: ");
			Integer n = masukan.nextInt();
			
			List<Integer> scores = new ArrayList<>();
			List<Integer> recordBreaks = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				System.out.print("Masukkan score per game: ");
				scores.add(masukan.nextInt());
			}
			
			//======================================================
			
			Integer highestScore = scores.get(0);
			Integer lowestScore = scores.get(0);
			Integer highest = 0;
			Integer lowest = 0;
			
			for (int i = 1; i < scores.size(); i++) {
				if (scores.get(i) > highestScore) {
					highestScore = scores.get(i);
					highest++;
				} else if (scores.get(i) < lowestScore) {
					lowestScore = scores.get(i);
					lowest++;
				}
			}
			
			recordBreaks.add(0, highest);
			recordBreaks.add(1, lowest);
			
			System.out.println(recordBreaks);
		}
		
	}
}
