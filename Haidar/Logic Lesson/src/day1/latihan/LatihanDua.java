package day1.latihan;

import java.util.Scanner;

public class LatihanDua {

	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan Nama: ");
		String nama = masukan.nextLine();
		
		System.out.print("Masukkan Umur: ");
		int umur = masukan.nextInt(); 
		
		System.out.print("Masukkan Golongan: ");
		String goldar = masukan.next();
		
		System.out.print("Masukkan Universitas: ");
		masukan.nextLine();
		String univ = masukan.nextLine();
		
		System.out.println(nama);
		System.out.println(umur);
		System.out.println(goldar);
		System.out.println(univ);
		
	}

}
//5m