package day5.latihan.exam;

import java.util.Scanner;

public class Soal9LembahGunung {

	// N = naik
	// T = turun

	// setiap 0 maka akan menjadi

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("rute: ");

		String rute = scan.nextLine();

		String[] arrHatori = rute.split(" ");

		int awal = 0;
		int gunung = 0;
		int lembah = 0;

		for (int i = 0; i < arrHatori.length; i++) {
			// jika N maka awal +1
			if (arrHatori[i].equalsIgnoreCase("N")) {
				awal++;
			} else if (arrHatori[i].equalsIgnoreCase("T")) {
				awal--;
			} else {
				System.out.println("Input Salah");
			}
			if (awal == 0 && arrHatori[i].equalsIgnoreCase("N")) {
				gunung++;
			} else if (awal == 0 && arrHatori[i].equalsIgnoreCase("T")) {
				lembah++;
			}
		}
		
		System.out.println("gunung "+gunung);
		System.out.print("lembah "+lembah);

	}

}
