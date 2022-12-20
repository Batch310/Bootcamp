package Day3.pagi;

public class MateriString {

	public static void main(String[] args) {

		String a = "Xsis Academy";
		String b = "Xsis academy";

		// samakan var/Inputan tidak memperhatikan besar kecil huruf
		if (a.equals(b)) {
			System.out.println("Ya, nama persis");
		} else {
			System.out.println("Tidak, tidak persis");
		}

		// samakan var/Inputan tidak memperhatikan besar kecil huruf
		if (a.equalsIgnoreCase(b)) {
			System.out.println(" sama persis");
		} else {
			System.out.println("Tidak sama persis");
		}

		// Mendapatkan panjang panjang string
		System.out.println(a.length());

		// Mendapatkan karakter(sesuai indeks 0 1 2..n)
		char newChar = a.charAt(6); // indeks Hanya bisa disimpan di char(sama)
		System.out.println(a.charAt(6));

		// ubah huruf menjadi kapital semua
		System.out.println(a.toUpperCase());

		// ubah huruf menjadi kecil semua
		System.out.println(a.toLowerCase());

		// Replace
		String newAcademy = a.replace("Xsis", "Imam"); // Menyimpan hasil replace ke variabel
		System.out.println(a.replace("Xsis", "Imam"));
		System.out.println(a.replace(" ", "|||"));

		// Contains, apakah var mengandung?
		System.out.println(a.contains("Xsis")); // true atau false

		// Substring adalah memotong sesuai index
		// memotong depan belakang
		System.out.println(a.substring(0, 4)); // (0=batas depan, 4 =belakang)

		// memotong depan saja
		System.out.println(a.substring(5));

		// Split memecah string
		String[] newArray = a.split(" ");
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}

		System.out.println("-------------------");

		// atau pake foreach
		for (String string : newArray) {
			System.out.print(string + " ");
		}

	}

}
