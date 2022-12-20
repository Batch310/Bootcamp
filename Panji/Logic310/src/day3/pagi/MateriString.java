package day3.pagi;

import java.util.Iterator;

public class MateriString {

	public static void main(String[] args) {
		String a = "Xsis Academy";
		String b = "xsis academy";

		// Fungsi equels (membandingkan string)
		if (a.equals(b)) {
			System.out.println("Ya Nama Sama");
		} else {
			System.out.println("Nama Tidak sama");
		}

		// Membandingkan string tanpa memperhatikan huruf besar kecil
		if (a.equalsIgnoreCase(b)) {
			System.out.println("Nama Mirip");
		} else {
			System.out.println("Tidak Mirip");
		}

		// Mendapatkan panjang string(kata)
		System.out.println(a.length());

		// Memndapatkan karakter
		char newChar = a.charAt(6);
		System.out.println(a.charAt(6));

		// Mengubah Huruf menjadi Kapital semua
		System.out.println(a.toUpperCase());

		// Mengubah Hurum kecil semua
		System.out.println(a.toLowerCase());

		// Replace dan menyimpan hasil replace
		String newAcademy = a.replace("Xsis", "Panji");
		System.out.println(a.replace("Xsis", "Panji"));

		// Contains, mengandung
		System.out.println(a.contains("Xsis"));
		System.out.println(a.contains("xsis"));

		// Substring, memtong berdasarkan index
		System.out.println(a.substring(0, 4)); // Memotong depan belakang berdasa nilai index
		System.out.println(a.substring(5)); // Memotong depan dari nilai index
		
		
		System.out.println();
		
		
		//Split, memecah string
		String[] newArray = a.split(" ");
		for (String string : newArray) {
			System.out.println(string);
		}
		
		newArray = a.split("");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]);
		}
	
		
		System.out.println();
		for (String string : newArray) {
			System.out.print(string + " ");
		}
	}

}
