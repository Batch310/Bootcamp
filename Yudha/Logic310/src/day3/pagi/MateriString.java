package day3.pagi;

public class MateriString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nama1 = "Xsis Academy";
		String nama2 = "Xsis academy";
		
		// Membandingkan String "equals"
		if(nama1.equals(nama2)) {
			System.out.println("Ya, nama sama");
		}
		else {
			System.out.println("Tidak, nama tidak sama");
		}
		// membandingkan String tanpa memperhatikan huruf kapital
		if(nama1.equalsIgnoreCase(nama2)) {
			System.out.println("Ya, nama sama");
		}
		else {
			System.out.println("Tidak, nama tidak sama");
		}
		
		// menghitung panjang string
		System.out.println(nama1.length());
		
		// mendapatkan character
		char c = nama1.charAt(6);
		System.out.println(nama1.charAt(6));
		System.out.println(c);
		
		// mengubah huruf menjadi kapital
		System.out.println(nama1.toUpperCase());
		System.out.println(nama1.toLowerCase());
		
		// mengganti string
		System.out.println(nama1.replace("Xsis", "yykw"));
		System.out.println(nama1.replace("s", "5"));// mengubah semua yang mengandung s
		System.out.println(nama1.replace("a", "4"));// tidak mengubah huruf besar
		String nama3 = nama1.replace("Academy", "University");
		System.out.println(nama3);
		
		//Contains, mengandung : untuk cek apakah suatu string mengandung character tertentu
		System.out.println(nama1.contains("XSis"));
		System.out.println(nama1.contains("Xsis"));
		
		//SUbstring : memotong berdasaarkan index
		System.out.println(nama1.substring(5)); // potong depan
		System.out.println(nama1.substring(0,4)); // ambil depan
		
		//Split, memecah string
		String[] newArray = nama1.split(" ");
		for (String string : newArray) {
			System.out.println(string);
		}
		
		newArray = nama1.split("");
		for (String string : newArray) {
			System.out.print(string+" ");
		}
		System.out.println();
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
	}

}
