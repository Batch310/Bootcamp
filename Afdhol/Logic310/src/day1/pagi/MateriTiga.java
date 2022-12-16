package day1.pagi;

import java.util.Scanner;

public class MateriTiga {

	public static void main(String[] args) {

		//membuat objek/ Instansiasi objek
		Scanner inputan = new Scanner(System.in);
		
		System.out.print("Masukkan nama: ");
		String nama = inputan.nextLine(); // inputan String
		
		System.out.print("Masukkan umur: ");
		int umur = inputan.nextInt(); // inputan String
		
		System.out.print("Masukkan asal: ");
		String asal = inputan.next(); // inputan String
		
		System.out.println();
		//cetak
		System.out.println("Nama saya...."+nama);
		System.out.println("Umur saya...."+umur);
		System.out.println("Asal saya...."+asal);
		
	}

}
