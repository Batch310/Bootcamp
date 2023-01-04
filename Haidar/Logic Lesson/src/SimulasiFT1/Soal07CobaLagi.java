package SimulasiFT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal07CobaLagi {
	public static void main(String[] args) {
	
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan input : ");
		String[] arrKata = masukan.nextLine().toLowerCase().split("");
		
		Arrays.sort(arrKata);
		
		String abjad = "abcdefghijklmnopqrstuvwxyz";
		
		String hasil = ""; 
		
		for (int i = 0; i < arrKata.length; i++) {
			if (abjad.contains(arrKata[i])) {
				if (!hasil.contains(arrKata[i]) && !arrKata[i-1].equals(" ")) {
					hasil += " | ";
				}
				hasil += arrKata[i];
			}
		}
		System.out.println(hasil);
		masukan.close();
		
	}
}
