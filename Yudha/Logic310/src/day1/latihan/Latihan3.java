package day1.latihan;

import java.util.Scanner;

public class Latihan3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Panjang : ");
		int panjang = input.nextInt();
		System.out.print("Lebar   : ");
		int lebar = input.nextInt();
		System.out.print("Tinggi  : ");
		int tinggi = input.nextInt();
		int volume = panjang * lebar * tinggi;
		System.out.println("Voulume Balok Adalah " + panjang + " x " + lebar + " x " + tinggi + " = " + volume);

	}

}
