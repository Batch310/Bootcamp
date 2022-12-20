package day3.morning;

public class MateriString {
	public static void main(String[] args) {

		//Deklarasi tipe data String
		String a = "Xsis Academy";
		String b = "Xsis academy ";
		
		//Membandingkan variabel tipe data String untuk mencocokkan apakah sama dengan menggunakan fungsi "variabel.equals"
		//Case sensitive
		if (a.equals("Xsis Academy")) {
			System.out.println("Ya, nama sama");
		} else {
			System.out.println("Tidak, nama tidak sama");
		}
		
		//Membandingkan 2 variabel tipe data String tanpa memperhatikan besar kecil huruf
		//Case insensitive
		if (a.equalsIgnoreCase(b)) {
			System.out.println("Nama mirip");
		} else {
			System.out.println("Tidak mirip");
		}
		
		//Mendapatkan panjang variabel tipe data String
		System.out.println(a.length());
		System.out.println(b.length());
		
		//Mendapatkan karakter dari data String
		char newChar = a.charAt(6); //Tipe data charAt berupa char, maka tidak bisa disimpan di String
		System.out.println(a.charAt(6)); //Mendapatkan huruf c
		
		//Mengubah huruf menjadi kapital semua
		System.out.println(a.toUpperCase());
		
		//Mengubah huruf menjadi kecil semua
		System.out.println(a.toLowerCase());
		
		//Mengganti huruf atau kata dengan huruf atau kata lain
		String newAcademy = a.replace("Xsis", "XSIS"); //Menyimpan perubahan data
		System.out.println(a.replace("Xsis", "Haidar")); //Tidak menyimpan perubahan data, hanya mengubah saat ditampilkan pada console saja
		System.out.println(a.replace(" ", "."));
		System.out.println(newAcademy);
		
		//Constains, Memeriksa apakah data String mengandung suatu kata atau kalimat. "Case Sensitive", dengan balikan boolean
		System.out.println(a.contains("Xsis"));
		System.out.println(a.contains("xsis"));
		
		//Substring, memotong kata atau kalimat dengan berdasar indeks
		System.out.println(a.substring(0, 4)); //Mengambil kata atau kalimat dari indeks ke-0 sampai sebelum indeks ke-4
		System.out.println(a.substring(5)); //Memotong kata atau kalimat dibelakang indeks yang diinginkan
		
		//Split, memecah atau memisahkan data String
		String[] XsisAcademy = a.split(" "); //Memecah atau memisahkan berdasar spasi, menjadi 2 kata. Isi array menjadi Xsis dan Academy
		for (String string : XsisAcademy) {
			System.out.println(string);
		}
		
		XsisAcademy = a.split(""); //Memecah atau memisahkan per kata. Isi array menjadi X, s, i, s, , A, c, a, d, e, m dan y
		for (String string : XsisAcademy) {
			System.out.println(string);
		}
		
	}
}
