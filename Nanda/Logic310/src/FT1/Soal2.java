package FT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("input n : ");
		String n = scanner.nextLine();
		
		String kumpulanKarakter = "abcdefghijklmnopqrstuvwxyz";
		
		String[] arrN = n.toLowerCase().split("");
		
		Arrays.sort(arrN);
		
		String hasil = "";
		
		String hurufSebelumnya = "";
		
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
		System.out.println(hasil);
	}

}
