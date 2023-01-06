package day6;

import java.util.Scanner;

public class StrongPassword {
	public static void main(String[] args) {
		
		String numbers = "0123456789";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialCharacter = "!@#$%^&*()-+";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan Password");
		String password = scanner.nextLine();
		
		int kekurangan = 0;
		
		boolean containDigit = false;
		boolean containLowerCase = false;
		boolean containUpperCase = false;
		boolean containSpecialCharacter = false; 
		
		String[] splitPassword = password.split("");
		
		for (int i = 0; i < splitPassword.length; i++) {
			if(numbers.contains(splitPassword[i])) {
				containDigit = true;
			}
			if(lowerCase.contains(splitPassword[i])) {
				containLowerCase = true;
			}
			if(upperCase.contains(splitPassword[i])) {
				containUpperCase = true;
			}
			if(specialCharacter.contains(splitPassword[i])) {
				containSpecialCharacter = true;
			}
		}
		
		if(containDigit == false) {
			kekurangan = kekurangan + 1;
		}
		if(containLowerCase == false) {
			kekurangan = kekurangan + 1;
		}
		if(containUpperCase == false) {
			kekurangan = kekurangan + 1;
		}
		if(containSpecialCharacter == false) {
			kekurangan = kekurangan + 1;
		}
		
		if(password.length() + kekurangan < 6) {
			kekurangan = kekurangan + (6 - (password.length() + kekurangan));
		}
		
		System.out.println("Passwordnya kurang : " + kekurangan);
	}
}
