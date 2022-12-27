package day8.test;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Case
		// 1 Botol = 2 Gelas
		// 1 Teko = 25 Cangkir
		// 1 Gelas = 2,5 Cangkir

		Scanner input = new Scanner(System.in);
		int konversi;
		double jumlahTeko = 0;
		double jumlahBotol = 0;
		double jumlahGelas = 0;
		double jumlahCangkir = 0;
		double ubah = 0;

		System.out.println("Menu Input");
		System.out.println("1. Teko");
		System.out.println("2. Botol");
		System.out.println("3. Gelas");
		System.out.println("4. Cangkir");

		System.out.print(" Pilih menu (1/2/3/4) : ");
		int menu = input.nextInt();

		switch (menu) {
		// 1 Teko = 5 Botol = 10 Gelas = 25 Cangkir
		case 1:
			System.out.println("Anda memilih menu Teko");
			System.out.println("1. Botol");
			System.out.println("2. Gelas");
			System.out.println("3. Cangkir");
			System.out.print("Pilih konversi ke : ");
			konversi = input.nextInt();
			if (konversi == 1) {
				System.out.print("Masukkan Jumlah Teko : ");
				jumlahTeko = input.nextInt();
				ubah = jumlahTeko * 5;
				System.out.println(jumlahTeko + " Teko = " + ubah + " Botol");
			} else if (konversi == 2) {
				System.out.print("Masukkan Jumlah Teko : ");
				jumlahTeko = input.nextInt();
				ubah = jumlahTeko * 10;
				System.out.println(jumlahTeko + " Teko = " + ubah + " Gelas");
			} else if (konversi == 3) {
				System.out.print("Masukkan Jumlah Teko : ");
				jumlahTeko = input.nextInt();
				ubah = jumlahTeko * 25;
				System.out.println(jumlahTeko + " Teko = " + ubah + " Cangkir");
			} else {
				System.out.print("Pilih yang bener -_- ");
			}
			break;

		case 2:
			System.out.println("Anda memilih menu Botol");
			System.out.println("1. Teko");
			System.out.println("2. Gelas");
			System.out.println("3. Cangkir");
			System.out.print("Pilih konversi ke : ");
			konversi = input.nextInt();
			if (konversi == 1) {
				System.out.print("Masukkan Jumlah Botol : ");
				jumlahBotol = input.nextInt();
				ubah = jumlahBotol / 5;
				System.out.println(jumlahBotol + " Botol = " + ubah + " Teko");
			} else if (konversi == 2) {
				System.out.print("Masukkan Jumlah Botol : ");
				jumlahBotol = input.nextInt();
				ubah = jumlahBotol * 2;
				System.out.println(jumlahBotol + " Botol = " + ubah + " Gelas");
			} else if (konversi == 3) {
				System.out.print("Masukkan Jumlah Botol : ");
				jumlahBotol = input.nextInt();
				ubah = jumlahBotol * 5;
				System.out.println(jumlahBotol + " Botol = " + ubah + " Cangkir");
			} else {
				System.out.print("Pilih yang bener -_- ");
			}
			break;

		case 3:
			System.out.println("Anda memilih menu Gelas");
			System.out.println("1. Teko");
			System.out.println("2. Botol");
			System.out.println("3. Cangkir");
			System.out.print("Pilih konversi ke : ");
			konversi = input.nextInt();
			if (konversi == 1) {
				System.out.print("Masukkan Jumlah Gelas : ");
				jumlahGelas = input.nextInt();
				ubah = jumlahGelas / 10;
				System.out.println(jumlahGelas + " Gelas = " + ubah + " Teko");
			} else if (konversi == 2) {
				System.out.print("Masukkan Jumlah Gelas : ");
				jumlahGelas = input.nextInt();
				ubah = jumlahGelas / 2;
				System.out.println(jumlahGelas + " Gelas = " + ubah + " Botol");
			} else if (konversi == 3) {
				System.out.print("Masukkan Jumlah Gelas : ");
				jumlahGelas = input.nextInt();
				ubah = jumlahGelas * 2.5;
				System.out.println(jumlahGelas + " Gelas = " + ubah + " Cangkir");
			} else {
				System.out.print("Pilih yang bener -_- ");
			}
			break;
			
		case 4:
			System.out.println("Anda memilih menu Cangkir");
			System.out.println("1. Teko");
			System.out.println("2. Botol");
			System.out.println("3. Gelas");
			System.out.print("Pilih konversi ke : ");
			konversi = input.nextInt();
			if (konversi == 1) {
				System.out.print("Masukkan Jumlah Cangkir : ");
				jumlahCangkir = input.nextInt();
				ubah = jumlahCangkir / 25;
				System.out.println(jumlahCangkir + " Cangkir = " + ubah + " Teko");
			} else if (konversi == 2) {
				System.out.print("Masukkan Jumlah Cangkir : ");
				jumlahCangkir = input.nextInt();
				ubah = jumlahCangkir / 5;
				System.out.println(jumlahCangkir + " Cangkir = " + ubah + " Botol");
			} else if (konversi == 3) {
				System.out.print("Masukkan Jumlah Cangkir : ");
				jumlahCangkir = input.nextInt();
				ubah = jumlahCangkir * 2.5;
				System.out.println(jumlahCangkir + " Cangkir = " + ubah + " Gelas");
			} else {
				System.out.print("Pilih yang bener -_- ");
			}
			break;
			
		default:
			break;
		}
	}

}
