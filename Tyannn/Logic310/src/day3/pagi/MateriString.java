package day3.pagi;

public class MateriString {

	public static void main(String[] args) {
		String nama = "Xsis Academy";
		
		// Membandingkan String "equals'
		if(nama.equals("Xsis Academy")) {
			System.out.println("Xsis Academy");
		}else {
			System.out.println("Tidak, tidak sama");
		}
		
		// Membandingkan String tanpa memperhatikan huruf kapital
		if(nama.equalsIgnoreCase("Xsis Academy")) {
			System.out.println("Nama Mirip");
		}else {
			System.out.println("Tidak Mirip");
		}
		
		// Mendapatkan panjang string
		System.out.println(nama.length());
		
		// Mendapatkan karakter
		char newChar = nama.charAt(6);
		System.out.println(nama.charAt(6));
		
		// Mengubah huruf menjadi kapital semua
		System.out.println(nama.toUpperCase());

		// Mengubah huruf menjadi huruf kecil semua
		System.out.println(nama.toLowerCase());
		
		// Replace 
		System.out.println(nama.replace("Xsis", "Tyan"));
		System.out.println(nama.replace(" ", "|||"));
		
		// Contains, mengandung
		System.out.println(nama.contains("Xsis")); // True or False
		
		//Substring, memotong berdasarkan index
		// Motong depan belakang
		System.out.println(nama.substring(0,4));
		
		// Motong depan saja
		System.out.println(nama.substring(5));
		
		// Split, memecah string
		String[] arrA = nama.split(" ");
		for (String string : arrA) {
			System.out.println(string);
		}
		arrA = nama.split("");
		for (String string : arrA) {
			System.out.print(string+" ");
		}
		
		// Split menggunakan for
		for (int i=0; i<arrA.length;i++){
			System.out.println(arrA[i]);
		}
		
	}

}
