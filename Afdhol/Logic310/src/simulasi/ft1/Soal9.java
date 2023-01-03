package simulasi.ft1;

import java.util.Scanner;

public class Soal9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//gunung : urutan naik dan turun bermula dari 0
		//lembah : urutan naik dan turun bermula dari 0
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Jalur: ");
		String input = scan.nextLine();
		
		String[] arrRute = input.split(" ");
		
		int gunung =0;
		int lembah = 0;
		int awal = 0;

		for (int i = 0; i < arrRute.length; i++) {
			if (arrRute[i].equals("N")) {
				awal++;
			}else if (arrRute[i].equals("T")) {
				awal--;
			}else {
				System.out.println("input salah");
			}
			
			if (awal == 0 && arrRute[i].equals("T")) {
				gunung++;
				// jika awal = 0 maka +1 lembah
			} else if (awal == 0 && arrRute[i].equals("N")) {
				lembah++;
			}
		}
		System.out.print("Gunung = " + gunung);
		System.out.print(" Lembah = " + lembah);
	}

}
