package day1.pagi;

import java.util.Scanner;

public class MateriTiga {

	public static void main(String[] args) {
		
		//Membuat Object / instansiasi object
		Scanner inputan = new Scanner(System.in);
		
		System.out.print("Masukkan Nama : ");
		String nama = inputan.nextLine(); //input String

		System.out.println("Nama saya ...." + nama);

		//______________________________________
		
		// Masukkan Umur (integer)
		System.out.print("Masukka Umur : ");
		int umur = inputan.nextInt();
		
		System.out.println("Umur saya...." + umur);
		
		//Solusi pertama
		//inputan.nextLine();
		
		// Masukkan Asal (string)
		System.out.print("Masukkan Asal : ");
		String asal = inputan.next();
		
		System.out.println("Asal Saya..." + asal);
	}

}
