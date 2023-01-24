package coba;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan array bilangan: ");
		
		String[] list = masukan.nextLine().split(",");
		
		masukan.close();
		
		int largest = Integer.parseInt(list[0]);
		
		for (int i = 0; i < list.length; i++) {
			int listInt = Integer.parseInt(list[i]);
			if (listInt >= largest) {
				largest = listInt;
			}
		}
		int secondLargest = Integer.parseInt(list[0]);
		for (int i = 0; i < list.length; i++) {
			int listInt = Integer.parseInt(list[i]);
			if (listInt < largest && listInt > secondLargest) {
				secondLargest = listInt;
			} 
		}
		
		System.out.println(secondLargest);
		
	}
}
