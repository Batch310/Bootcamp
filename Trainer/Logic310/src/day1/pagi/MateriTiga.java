package day1.pagi;

import java.util.Scanner;

public class MateriTiga {

	public static void main(String[] args) {
		
		//Membuat Object / Instansiasi Object
		Scanner inputan = new Scanner(System.in);
		
		System.out.print("Masukkan Nama : ");
		String nama = inputan.next(); //input String
		
		System.out.println("Nama saya ...." + nama);
		
		//_____________________
		
		//Masukkan Umur (Integer)
		System.out.print("Masukkan Umur : ");
		int umur = inputan.nextInt();
		
		System.out.println("Umur Saya " + umur);
		
		//Solusi pertama
		inputan.nextLine();
		
		//Masukkan Asal (String)
		System.out.print("Masukkan Asal : ");
		String asal = inputan.next();
		
		System.out.println("Asal saya " + asal);
		
	}

}
