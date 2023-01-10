package FT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//urutan dibalik (descending) dan vokal dicetak 1x
		
		System.out.print("input n : ");
		String n = scanner.nextLine();
		
		String kumpulanKarakter = "bcdfghjklmnpqrstvwxyz";
		String vocal = "aiueo";
		
		String[] arrN = n.toLowerCase().split("");
		
		Arrays.sort(arrN);
		
		String hasil = "";
		
		String hurufSebelumnya = "";
		
		String hasil1 = "";
		
		for (int i = 0; i < arrN.length; i++) {
			String hurufSekarang = arrN[i];
			if(kumpulanKarakter.contains(hurufSekarang)){
				if(!hurufSekarang.equals(hurufSebelumnya)) {
					if(!hurufSebelumnya.equals("")) {
						hasil = hasil + " - ";
					}
				}
				hasil = hasil + arrN[i];
				hurufSebelumnya = hurufSekarang;
			}
		}
		for (int i = 0; i < arrN.length; i++) {
			String hurufVocal = arrN[i];
			if(vocal.contains(hurufVocal)) {
				if(hurufVocal.equals(hurufSebelumnya)) {
					hasil1 = hasil1 + " - ";
				}
			}
			
		}
		
		System.out.println(hasil);
		System.out.println(hasil1);

	}

}
