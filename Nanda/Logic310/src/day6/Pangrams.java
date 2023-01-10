package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Pangrams {
	public static void main(String[] args) {
		
		String kunci = "abcdefghijklmnopqrstuvwxyz";
		String[] arrKunci = kunci.split("");
		int indexKunci = 0;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Masukkan kata kata : ");
		String inputan = scanner.nextLine();
		String[] arrInputan = inputan.toLowerCase().split("");
		
		//Sorting si Array Inputan
		Arrays.sort(arrInputan);

		for (int i = 0; i < arrInputan.length; i++) {
			if(arrKunci[indexKunci].equals(arrInputan[i])) {
				indexKunci++;
			}
		}
		
		if (indexKunci == arrKunci.length) {
			System.out.println("pangram");	
		} else {
			System.out.println("not pangram");
		}
		
	}
}
