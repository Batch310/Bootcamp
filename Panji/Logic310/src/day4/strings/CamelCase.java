package day4.strings;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//System.out.print("");
		String kalimat = input.nextLine();
		
		int kata = 1;
		for (int i = 0; i < kalimat.length(); i++) {
			if(i == 0 && Character.isUpperCase(kalimat.charAt(i))) {
				continue;
			}
			if(Character.isUpperCase(kalimat.charAt(i))) {
				kata++;
			}
		}
		
		System.out.println();
		System.out.print("Output : ");
		System.out.println(kata);

	}

}
