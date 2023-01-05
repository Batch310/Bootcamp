package day1.pagi;

import java.util.Scanner;

public class MateriTiga_BuatObject {

	public static void main(String[] args) {
		
		
		//Membuat Object atau Instansiasi(Alat) Object
		Scanner inputan = new Scanner(System.in);   //Scanner adalah alat(misal kalkulator)
		
		System.out.print("Masukkan Nama =");
		String nama = inputan.nextLine(); //inputstring
		
		System.out.println("Nama saya adalah " + nama);
		
		//Masukkan Umur(Integer)
		System.out.print("Masukkan Umur =");
		int umur = inputan.nextInt();
		System.out.println("Umur saya adalah " + umur);
		
		//SOLUSI SATU SCANNER(ALAT) 2 VARIABEL
		   //Solusi pertama
		    //inputan.nextLine();
		    
		   //Solusi kedua = inputan.nextLine(); diganti inputan.next()    
		
		//Masukkan Asal(String)
		System.out.print("Masukkan Asal =");
		String asal = inputan.next();
		System.out.println("Asal saya dari " + asal);
		
		
		
	}
}
