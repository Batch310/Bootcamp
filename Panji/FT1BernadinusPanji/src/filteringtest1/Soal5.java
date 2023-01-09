package filteringtest1;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Input panjang sisi : ");
		int panjangSisi = input.nextInt();
		
		System.out.print("Panjang Salah satu rusuk : ");
		int panjangRusuk = input.nextInt();
		
		
		double luasPersegi = Math.pow(panjangSisi,2);
		double luasPermukaan = Math.pow(panjangRusuk,2) * 6;
		
		double jumlahPersegi = luasPermukaan/luasPersegi;
		
		
		
		
		System.out.println();
		
		System.out.println("banyak persegi " + jumlahPersegi);

	}

}
