package day3.latihan2;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal2StrongPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#$%^&*()-+";
		
		String[] arrayNumbers = numbers.split("");
		String[] arrayLower = lower_case.split("");
		String[] arrayUpper = upper_case.split("");
		String[] arrayCharacter = special_characters.split("");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Panjang Pasword : ");
		int panjang = input.nextInt();
		
		System.out.print("Masukkan Password : ");
		String password = input.next();
		String[] arrayPassword = password.split("");
		// mencari karakter unik
		int terpenuhi = 0,min =6,kurang=0,kriteria = 5;
		for (int i = 0; i < arrayNumbers.length; i++) {
			if(password.contains(arrayNumbers[i])) {
				terpenuhi++;
				break;
			}
		}
		for (int i = 0; i < arrayLower.length; i++) {
			if(password.contains(arrayLower[i])) {
				terpenuhi++;
				break;
			}
		}
		for (int i = 0; i < arrayLower.length; i++) {
			if(password.contains(arrayUpper[i])) {
				terpenuhi++;
				break;
			}
		}
		for (int i = 0; i < arrayCharacter.length; i++) {
			if(password.contains(arrayCharacter[i])) {
				terpenuhi++;
				break;
			}
		}
		if(password.length()<min) {
			//if(kriteria<=2)
			kurang = min - password.length();
			//jumlah 1 kriteria 1 = 4
			// jumlah 2 kriteria 1 = 4
			//jumlah  2,5kriteria 2 = 4
			//jumlah 3 kriteria 1 = 4
			// 3 2 = 3
			// 3 3 = 3
			// 4 1 = 4
			// 4 2 = 3
			// 4 3 = 2
			// 4 4 = 2
			// 5 1 = 4
			// 5 2 = 3
			// 5 3 = 2
			// 5 4 = 1
					
					
			// kriteria 1 jumlah 1 = 4
			// 4 1 2 = 4
			// 4 1 3 = 4
			// 4 1 4 = 4
			// 4 1 5 = 4
			// kriteria 2 jumlah 1 = 4
			// 3 2 2 = 4
			// 3 2 3 = 3
			// 3 2 4 = 3
			// 3 2 5 = 3
			// 2 3 3 = 3
			// 2 3 4 = 2
			// 2 3 5 = 2
			// 1 4 4 = 2
			// 1 4 5 = 2
		}
		else {
			terpenuhi++;
			kurang = kriteria - terpenuhi;
		}
		System.out.println(kurang);
		

		
		
		
		

	}

}
