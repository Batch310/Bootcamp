package day5.latihan;

import java.util.Arrays;
import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String vokal = "aiueo";
		String konsonan = "bcdfghjklmnpqrstvwxyz";
		
		System.out.print("Masukan kata = ");
		String kata = input.nextLine().toLowerCase();
		
		String[] arrKata = kata.split("");
//		String[] arr_voka = kata.split("");
//		String[] arr_konsonan = kata.split("");
		
		Arrays.sort(arrKata);
//		Arrays.sort(arr_vokal);
//		Arrays.sort(konsonan1);
		
		String a = "";
		String b = "";
		for(int i=0;i<arrKata.length;i++) {
	
			if(vokal.contains(arrKata[i]) ) {
				a += arrKata[i];
			}else if(konsonan.contains(arrKata[i])) {
				b += arrKata[i];
			}
		}
		System.out.println();
		System.out.print("Huruf Vokal = "+a);
		System.out.println();
		System.out.print("Huruf Konsonan = "+b);
		
		

	}

}
