package day1.pagi;

import java.util.Scanner;

public class MateriTiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputan = new Scanner(System.in);
		System.out.print("Masukkan nama: ");
		String nama = inputan.nextLine();
		System.out.println("Nama saya " + nama);
		
		System.out.print("Masukkan umur: ");
		int umur = inputan.nextInt();
		System.out.println("Umur saya " + umur + " tahun");
		
		System.out.print("Masukkan alamat: ");
		String alamat = inputan.next();
		System.out.println("Alamat saya di " + alamat);
		
	}

}