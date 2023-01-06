package day6;

import java.util.Scanner;

import java.util.Iterator;
import java.util.Scanner;

public class HackerRankInAString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sampel Input : ");
		int sampleInput = scanner.nextInt();
		scanner.nextLine();
		
		String[] arrInput = new String[sampleInput];
		
		for (int i = 0; i < sampleInput; i++) {
			System.out.print("Masukkan kata ke-" + (i+1) + " : ");
			arrInput[i] = scanner.nextLine();
		}
		
		for (int i = 0; i < arrInput.length; i++) {
			String kata = arrInput[i];
			
			String kunci = "hackerrank";
			String[] arrKunci = kunci.split("");
			int indexCheckPoint = 0;
			
			String[] arrKata = kata.toLowerCase().split("");
			
			for (int j = 0; j < arrKata.length; j++) {
				if(arrKunci[indexCheckPoint].equals(arrKata[j])) {
					indexCheckPoint++;
				}
			}
			
			if (indexCheckPoint == arrKunci.length) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
