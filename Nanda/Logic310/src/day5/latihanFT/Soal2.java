package day5.latihanFT;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Kalimat : ");
		String kalimat = input.nextLine();
		
		String[] kata = kalimat.toLowerCase().split("");
		
		String vokal = "aiueo";
		String konsonan = "bcdfghjklmnpqrstvwxyz";
				
		Arrays.sort(kata);
		
		String hasilvokal = "";
		String hasilkonsonan = "";
		
		for (int i = 0; i < kata.length; i++) {
			if (vokal.contains(kata[i])) {
				hasilvokal += kata[i];
			}
		}
		for (int i = 0; i < kata.length; i++) {
			if (konsonan.contains(kata[i])){
				hasilkonsonan += kata[i];
			}
		}
		
		System.out.print(hasilvokal);
		System.out.println();
		System.out.print(hasilkonsonan);
			}
}
