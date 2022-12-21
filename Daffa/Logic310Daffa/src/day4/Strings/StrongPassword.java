package day4.Strings;

import java.util.Scanner;

public class StrongPassword {

	public static void main(String[] args) {
		// BELUM SELESAI
		Scanner input = new Scanner(System.in);
		
		System.out.println("Buat password baru.");
		System.out.println("Password minimal 6 karakter, "
				+ "\nmengandung 1 digit, "
				+ "\nmengandung 1 huruf besar, "
				+ "\nmengandung 1 huruf kecil, "
				+ "\ndan 1 spesial karakter : "
				+ "!@#$%^&*()-+");
		
		String numbers = "0123456789",
				lowCase = "abcdefghijklmnopqrstuvwxyz",
				upCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				sc = "!@#$%^&*()-+";
		
		int panjangPassword = 6,
				digit = 0,
				hurufBesar = 0,
				hurufKecil = 0,
				spesialKarakter = 0;
		
		char cekPass;
			
		System.out.print("\nMasukkan password baru : ");
		String pass = input.next();
		
		int totalPanjang = pass.length();
		if (totalPanjang < panjangPassword) {
			System.out.println("Panjang password minimal 6 karakter!");
			return;
		} else {
			
			for (int i = 0; i < totalPanjang; i++) {
				cekPass = pass.charAt(i);
				if (Character.isDigit(cekPass)) {
					digit++;
				} else if (Character.isLowerCase(cekPass)){
					hurufKecil++;
				} else if (Character.isUpperCase(cekPass)) {
					hurufBesar++;
				} else {
					spesialKarakter++;
				}
			}
		}
		if (digit == 0) {
			System.out.println("Password harus mengandung minimal 1 digit!");
		}
		if (hurufKecil == 0) {
			System.out.println("Password harus mengandung minimal 1 huruf kecil!");
		}
		if (hurufBesar==0) {
			System.out.println("Password harus mengandung minimal 1 huruf besar!");
		}
		if (spesialKarakter == 0) {
			System.out.println("Password harus mengandung minimal 1 spesial karakter : "
					+ "!@#$%^&*()-+");
		}
		System.out.println("Password selesai dibuat.");
	}

}
