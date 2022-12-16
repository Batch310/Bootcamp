package day1.morning;

import java.util.Scanner;

public class MateriTiga {

	public static void main(String[] args) {
		
		//Membuat Objek / Instansiasi Objek
		
		//Cara 1
		Scanner inputan = new Scanner(System.in); //Daftar Presensi atau Kalkulator
		
		//System.out.print("Masukkan Nama: ");
		//String nama = inputan.nextLine(); //input String //Presensi atau Angka Kalkulator
		
		
		//System.out.println("Nama saya " + nama);
		
		//Masukkan Umur
		//Scanner inputan1 = new Scanner(System.in);
		
		//System.out.print("Masukkan Umur: ");
		//int umur = inputan1.nextInt();
		
		//System.out.println("Umur saya " + umur);
		
		//Masukkan Asal Daerah
		//Scanner inputan2 = new Scanner(System.in);
		
		//System.out.print("Masukkan Asal Daerah: ");
		//String asal = inputan2.nextLine();
		
		//Cara 2 (Lebih efektif)
		System.out.print("Masukkan Nama: ");
		String nama = inputan.nextLine();
		System.out.print("Masukkan Umur: ");
		int umur = inputan.nextInt();
		System.out.print("Masukkan Asal: ");
		//Solusi 1 supaya tidak bug
		//inputan.nextLine();
		//String asal = inputan.nextLine();
		//Solusi 2 supaya tidak bug
		String asal = inputan.next();
		
		System.out.println("Nama saya " + nama);
		System.out.println("Umur saya " + umur);
		System.out.println("Asal saya dari " + asal);

	}

}
