package day3.pagi;

public class MateriString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Xsis Academy";
		String b = "Xsis academy";

		// Fungsi "equals" untuk membandingkan String
		if (a.equals(b)) {
			System.out.println("Sama persis");
		} else {
			System.out.println("Tidak sama persis");
		}

		// Fungsi equalsIgnoreCase tidak case-sensitive
		if (a.equalsIgnoreCase(b)) {
			System.out.println("Mirip");
		} else {
			System.out.println("Tidak mirip");
		}

		// Mendapatkan panjang String
		System.out.println(a.length());

		// Mendapatkan 1 karakter dalam String
		char newChar = a.charAt(6);
		System.out.println(a.charAt(6));

		// Mengubah String menjadi huruf besar semua
		System.out.println(a.toUpperCase());

		// Mengubah String menjadi huruf kecil semua
		System.out.println(a.toLowerCase());

		// Fungsi replace untuk mengganti karakter dalam String
		b = b.replace("Xsis", "Jambrong");
		System.out.println(b);
		System.out.println(a.replace(" ", "|||"));

		// Fungsi contains, mengandung
		System.out.println(a.contains("Xsis")); // Hasilnya true atau false

		// Substring, memotong berdasarkan index
		System.out.println(a.substring(0, 4)); //Memotong depan - belakang
		System.out.println(a.substring(5));
		
		System.out.println();
		
		//Split untuk memecah String
		String[] newArray = a.split(" ");
		for (String string : newArray) {
			System.out.println(string);
		}
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		
		newArray = a.split("");
		for (String string : newArray) {
			System.out.print(string + " ");
		}
	}

}
