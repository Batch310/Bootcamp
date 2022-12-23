package day3.pagi;

public class MateriString {

	public static void main(String[] args) {

		String a = "Xsis Academy";
		String b = "Xsis academy";

		// fungsi equal untuk membandingkan, dengan case sensitive
		if (a.equals(b)) {
			System.out.println("Nama sama");
		} else {
			System.out.println("Nama tidak sama");
		}

		// fungsi equalignorecase untuk tidak case sensitive
		if (a.equalsIgnoreCase(b)) {
			System.out.println("Nama mirip");
		} else {
			System.out.println("Tidak mirip");
		}

		// Mendapatkan panjang String termasuk spasi
		System.out.println(a.length());

		// Mendapatkan karakter
		char newChar = a.charAt(6);
		System.out.println(a.charAt(6));
		System.out.println(newChar);

		// Mengubah huruf menjadi kapital semua
		System.out.println(a.toUpperCase());

		// Mengubah huruf menjadi kecil semua
		System.out.println(a.toLowerCase());
		
		//mengganti kata
		System.out.println(a.replace("Xsis", " "));
		String academy = a.replace("Xsis", "New");
		System.out.println(academy);
		
		//mengecek apakah terkandung kata-kata
		//case sensitive
		System.out.println(a.contains("Xsis"));
		System.out.println(a.contains("xsis"));
		
		//Substring, memotong berdasarkan indeks
		System.out.println(a.substring(0,4)); //memotong depan dan belakang
		System.out.println(a.substring(5)); //memotong depan saja
		
		//memecah String berdasarkan penghubungnya
		//menggunakan foreach
		//menggunakan Array
		
		String[] newArray= a.split(" ");
		for (String string : newArray) {
			System.out.println(""+string);
		}
		
		newArray = a.split(" ");
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		
		System.out.println();
		
		//memisahkan per huruf
		for (String string : newArray) {
			System.out.print(string+" ");
		}

	}

}
