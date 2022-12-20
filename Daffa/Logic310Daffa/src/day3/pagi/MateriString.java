package day3.pagi;

public class MateriString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Xsis Academy";
		String b = "Xsis academy";
		
		// Fungsi "equals" untuk membandingkan String
		if (a.equals(b)) {
			System.out.println("Ya");
		} else {
			System.out.println("Tidak");
		}
		
		// Fungsi equalsIgnoreCase tidak case-sensitive
		if (a.equalsIgnoreCase(b)) {
			System.out.println("Ya");
		} else {
			System.out.println("Tidak");
		}

	}

}
