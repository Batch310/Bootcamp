package day6;

import java.util.Scanner;

public class Gemstones {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan Angka : ");
		int jumlah = scanner.nextInt();
		scanner.nextLine();

		String[] arrGems = new String[jumlah];
		for (int i = 0; i < arrGems.length; i++) {
			System.out.print("Masukkan Gem ke-" + (i + 1) + ": ");
			arrGems[i] = scanner.nextLine();
		}

		String finalResult = "";
		for (int i = 0; i < arrGems.length; i++) {
			String tempResult = "";
			String[] tempArrString = arrGems[i].split("");
			for (int j = 0; j < tempArrString.length; j++) {
				if (i == 0) {
					if (!(tempResult.contains(tempArrString[j]))) {
						tempResult += tempArrString[j];
					}
				} else {
					if(finalResult.contains(tempArrString[j])) {
						if (!(tempResult.contains(tempArrString[j]))) {
							tempResult += tempArrString[j];
						}
					}
				}
			}
			finalResult = tempResult;
		}
		
		System.out.println(finalResult.length());

	}
}
