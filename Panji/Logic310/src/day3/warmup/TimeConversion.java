package day3.warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Jam : ");
		String jam = input.nextLine();
		
		char ap = jam.charAt(8); //Acuan untuk merubah
		
		if(ap == 'A') {
			if(jam.substring(0, 2).equals("12")) {
				System.out.print("00" + jam.substring(2, 8));
			}else {
				System.out.print(jam.substring(0,8));
			}
		}else if(ap == 'P') {
			if(jam.substring(0,2).equals("12")) {
				System.out.print(jam.substring(0, 8));
			}else {
				int intJam = Integer.parseInt(jam.substring(0,2)); //Convert String ke integer
				intJam += 12;
				System.out.print(intJam + jam.substring(2,8));
			}
		}

	}

}
