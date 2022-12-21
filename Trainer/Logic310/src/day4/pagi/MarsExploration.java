package day4.pagi;

import java.util.Scanner;

public class MarsExploration {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukkan Kode : ");
		String kode = scanner.nextLine();
		
		int errorCount = 0;
		
		String[] arrKode = kode.split("");
		for (int i = 0; i < arrKode.length; i = i + 3) {
			if(!(arrKode[i].equals("S"))) {
				errorCount++;
			} 
			if(!(arrKode[i+1].equals("O"))) {
				errorCount++;
			} 
			if(!(arrKode[i+2].equals("S"))) {
				errorCount++;
			}
		}
		
		System.out.println(errorCount);
		
	}
}
