package simulasift1;

import java.util.Arrays;
import java.util.Scanner;

public class soal7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String abjad = "abcdefghijklmnopqrstuvwxyz";

		System.out.print("input n : ");
		String kata = input.nextLine().toLowerCase();
		
		String[] arrKata = kata.split("");
		
		Arrays.sort(arrKata);
		
		String a = "";
		String b = "";
		for(int i=0;i<arrKata.length;i++) {
	
			if(abjad.contains(arrKata[i]) ) {
				a += arrKata[i];
			}
		}
		System.out.println();
		System.out.print(a);
	
	}

}
