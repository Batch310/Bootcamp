package day3.pagi;

public class MateriString {

	public static void main(String[] args) {

		String a = "Xsis Academy Jogja";
		String b = "Xsis academy";

		// samakan var/Inputan memperhatikan besar kecil huruf
		if (a.equals(b)) {
			System.out.println("Ya, nama persis");
		} else {
			System.out.println("Tidak, tidak persis");
		}

		// samakan var/Inputan Tidak memperhatikan besar kecil huruf
		if (a.equalsIgnoreCase(b)) {
			System.out.println(" sama persis");
		} else {
			System.out.println("Tidak sama persis");
		}

		// Mendapatkan panjang panjang string
		System.out.println(a.length());

		// Mendapatkan karakter(sesuai indeks 0 1 2..n)
		char newChar = a.charAt(9); // indeks Hanya bisa disimpan di char(sama)
		System.out.println(newChar);

		// ubah huruf menjadi kapital semua
		System.out.println(a.toUpperCase());

		// ubah huruf menjadi kecil semua
		System.out.println(a.toLowerCase());

		// Replace
		String newAcademy = a.replace("Xsis", "INDONESIA"); // Menyimpan hasil replace ke variabel
		System.out.println(newAcademy);
		System.out.println(a.replace(" ", "|||"));

		// Contains, apakah var mengandung?
		System.out.println(a.contains("Xsis")); // true atau false
		
		
		// a = Xsis Academy jogja

		System.out.println("-------------------");
		// Substring adalah memotong sesuai index
		// memotong depan belakang
		System.out.println(a.substring(5, 12)); // (0=batas depan, 4 =belakang)

		// memotong depan saja
		System.out.println(a.substring(13));
		
		System.out.println("-----------------------");

		// Split memecah string (Mengambil isi array)
		
		String[] newArray = a.split("-");
		for (String string : newArray) {
			System.out.println(string);
		}
		
		//Cetak semua isi dari array
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i] + " ");
		}

		System.out.println("-------------------");

		// atau pake foreach
		for (String string : newArray) {
			System.out.print(string + " ");
		}

	}

}
