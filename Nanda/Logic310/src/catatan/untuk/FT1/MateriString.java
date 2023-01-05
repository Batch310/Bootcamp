package catatan.untuk.FT1;

public class MateriString {

	public static void main(String[] args) {
		String a = "Xsis Academy";
		String b = "Xsis academy";
		
		//Membandingkan String "equals"
		if(a.equals(b)) {
			System.out.println("Ya nama sama");
		}else {
			System.out.println("Tidak, tidak sama");
		}
		
		//Membandingkan String tanpa memperhatikan huruf kapital
		if(a.equalsIgnoreCase(b)) {
			System.out.println("Nama mirip");
		}else {
			System.out.println("TIdak mirip");
		}
		
		//Mendapatkan panjang string
		System.out.println(a.length());
		
		//Mendapatkan karakter
		char newChar = a.charAt(6); //balikan charAt
		System.out.println(a.charAt(6));
		
		//Mengubah huruf menjadi kapital semua
		System.out.println(a.toUpperCase());
		
		//Mengubah huruf menjadi kecil semua
		System.out.println(a.toLowerCase());
		
		//Menyimpan String ke variabel
		String newAcademy = a.replace("Xsis", "SIP");
		//Mengganti karakter
		System.out.println(a.replace("Xsis", "SIP"));
		//Mengganti karakter spasi
		System.out.println(a.replace(" ", "-"));
		
		//Contains, mengandung
		System.out.println(a.contains("Xsis"));
		
		//Substring untuk memotong berdasarkan index
		//potong depan belakang
		System.out.println(a.substring(0,4));
		//potong depan saja
		System.out.println(a.substring(4));
		
		//Split untuk memecah String
		String[] newArray = a.split("-");
		for(String string : newArray) {
			System.out.println(string);
			}
			
		newArray = a.split("");
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		System.out.println();
		for (String string : newArray) {
			System.out.print(string+" ");
		}
		}
	}
