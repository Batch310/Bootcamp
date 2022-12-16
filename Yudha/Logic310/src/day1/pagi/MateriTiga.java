package day1.pagi;

import java.util.Scanner; //class Scanner tidak ada di package yang sama

public class MateriTiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Membuat object / instansiasi Object
		Scanner inputan = new Scanner(System.in); // inputan system pada console
		System.out.print("Masukan Nama : ");
		String nama = inputan.nextLine(); // Input String
		
		// Masukan Umur
		System.out.print("Masukan Umur : ");
		int umur = inputan.nextInt();
		
		System.out.print("Masukan Asal : ");
		String asal = inputan.next();
		
		System.out.println("Nama : " + nama +"\nUmur : "+umur+"\nAsal : "+ asal);
		
	}

}
