package day5.latihanFT;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// input
		System.out.print("Masukkan Kalimat : "); //Sample Case
		String kalimat = input.nextLine();

		String[] kata = kalimat.toLowerCase().split(""); //jadikan lowercase = sample case 
		//lalu spit jadi = {s,a,m,p,l,e, ,c,a,s,e} 

		String vokal = "aiueo";
		String konsonan = "bcdfghjklmnpqrstvwxyz";

		Arrays.sort(kata); // mengurutkan abjad { ,a,a,c,e,e,l,p,s,s}

		String hasilvokal = "";
		String hasilkonsonan = "";

		for (int i = 0; i < kata.length; i++) { //1245
			if (vokal.contains(kata[i])) { //mebandingkan vokal dg isi array kata
				hasilvokal += kata[i]; //aaee
			}
		}
		for (int i = 0; i < kata.length; i++) { //36789 
			if (konsonan.contains(kata[i])) {
				hasilkonsonan += kata[i]; //clpss
			}
		}
		System.out.print(hasilvokal); //aaee
		System.out.println();
		System.out.print(hasilkonsonan); //clpss
	}
}