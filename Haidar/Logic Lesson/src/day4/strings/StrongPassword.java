package day4.strings;

import java.util.Scanner;

public class StrongPassword {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan name: ");
		String name = masukan.nextLine();
		
		System.out.print("Masukkan password: ");
		String password = masukan.next();
		
		String nums = "0123456789";
		String lowCase = "abcdefghijklmnopqrstuvwxyz";
		String upCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specChars = "!@#$%^&*()-+";
		
		String[] numbers = nums.split("");
		String[] lowerCase = lowCase.split("");
		String[] upperCase = upCase.split("");
		String[] specialCharacters = specChars.split("");
		
		//Syarat minimal password: 
		//Minimal 6 huruf
		//Minimal 1 digit
		//Minimal 1 lowercase
		//Minimal 1 uppercase
		//Minimal 1 karakter spesial
		
		//Output adalah kekurangan syarat yang terpenuhi dari password
		int kekurangan = 0;
		int num = 0;
		int loCase = 0;
		int uCase = 0;
		int spCase = 0;
		
		//Cek apakah panjang password kurang dari 6		
		if (password.length() < 6) {
			kekurangan = kekurangan + (6 - password.length());
		} else {
			for (int i = 0; i < numbers.length; i++) {
				if (password.contains(numbers[i])) {
					num++;
				}
			}
			for (int i = 0; i < lowerCase.length; i++) {
				if (password.contains(lowerCase[i])) {
					loCase++;
				}
				if (password.contains(upperCase[i])) {
					uCase++;
				}
			}
			for (int i = 0; i < specialCharacters.length; i++) {
				if (password.contains(specialCharacters[i])) {
					spCase++;
				}
			}
			
			if (num == 0 || loCase == 0 || uCase == 0 || spCase == 0) {
				kekurangan++;
			}	
		}
		
		System.out.println(kekurangan);
	
//		System.out.println(password.length());
//		System.out.println(Pattern.matches("password+", numbers));
//		System.out.println(Pattern.matches("password+", lowerCase));
//		System.out.println(Pattern.matches("password+", upperCase));
//		System.out.println(Pattern.matches("password+", specialCharacters));
//		
//		System.out.println(kekurangan);
		
	}
}
