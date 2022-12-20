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
		a = a.replace("Xsis", "Jambrong");
		System.out.println(a);
		System.out.println(a.replace(" ", "|||"));
	}

}
