package day3.warmup;

import java.util.Scanner;

public class WarmUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Insert AM/PM : ");
		String waqtu = input.next();
		String format = "hh:mm:ssAM";
		
		if(waqtu.length() == 10) {
			int jamNich = Integer.parseInt(waqtu.substring(0, 2));
			int menitNich = Integer.parseInt(waqtu.substring(3, 5));
			int detikNich = Integer.parseInt(waqtu.substring(6, 8));
			if (waqtu.substring(8).equals("AM")) {
				if (waqtu.substring(0, 2).equals("12")) {
					waqtu = "00" + waqtu.substring(2);
					System.out.println(waqtu.substring(0, 8));
				} else {
					System.out.println(waqtu.substring(0, 8));
				}
			} else if (waqtu.substring(8).equals("PM")) {
				jamNich += 12;
				waqtu.substring(2, 8);
				if (jamNich == 24) {
					jamNich = 12;
				}
				waqtu = jamNich + waqtu;
				System.out.println(waqtu);
			} else {
				System.out.println("Wrong insert!");
			}
		}
	}
}