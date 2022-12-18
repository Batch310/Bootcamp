package day1.latihan;

import java.util.Scanner;

public class LatihanDua {

	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in); //Inisiasi tipe data Scanner variabel masukan sebagai input dari console
		
		System.out.print("Masukkan Nama: ");
		String nama = masukan.nextLine(); //Input Nama
		
		System.out.print("Masukkan Umur: ");
		int umur = masukan.nextInt(); //Input Umur
		
		System.out.print("Masukkan Golongan: ");
		String goldar = masukan.next(); //Input Golongan
		
		System.out.print("Masukkan Universitas: ");
		masukan.nextLine();
		String univ = masukan.nextLine(); //Input Universitas
		
		System.out.println(nama);
		System.out.println(umur);
		System.out.println(goldar);
		System.out.println(univ);
		
	}

}
//5m