package day3.pagi;

public class MateriString {

	public static void main(String[] args) {
		String a = "Xsis-Academy";
		String b = "Xsis academy";
		
		//Membandingkan String
		if(a.equals(b)) {
			System.out.println("Sama Persis");
		} else {
			System.out.println("Tidak Sama Persis");
		}
		
		//Membandingkan String tanpa memperhatikan huruf kapital
		if(a.equalsIgnoreCase(b)) {
			System.out.println("Nama mirip");
		} else {
			System.out.println("Tidak Mirip");
		}
		
		//Mendapatkan panjang string
		System.out.println(a.length());
		
		//Mendapatkan karakter
		char newChar = a.charAt(6);
		System.out.println(a.charAt(6));
		
		//Mengubah huruf menjadi kapital semua
		System.out.println(a.toUpperCase());
		
		//Mengubah huruf menjadi huruf kecil semua
		System.out.println(a.toLowerCase());
		
		//Replace
		String newAcademy = a.replace("Xsis", "Panji");
		System.out.println(a.replace("Xsis", "Panji"));
		System.out.println(a.replace(" ", "|||"));
		
		//Contains, mengandung
		System.out.println(a.contains("Xsis")); //true/false
		
		//Substring memotong berdasarkan index
		//Motong depan belakang
		System.out.println(a.substring(0,4)); //Xsis
		//Motong depan saja
		System.out.println(a.substring(5)); //Academy
		
		System.out.println();
		
		//Split, memecah string
		String[] newArray = a.split("-");
		for (String string : newArray) {
			System.out.println(string);
		}
		
		newArray = a.split("");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]);
		}
		System.out.println();
		for (String string : newArray) {
			System.out.print(string+" ");
		}
		
		
	}

}
