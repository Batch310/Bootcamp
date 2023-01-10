package FT1;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukkan Jalur Chester : ");
		String JalurChester = scanner.nextLine();
		
		int gunung = 0;
		int lembah = 0;
		int jalur = 0;
		
		String[] arrN = JalurChester.split(" ");
		for (int i = 0; i < arrN.length; i++) {
			if (arrN[i].equals("N")) {
				jalur++;
			} else if (arrN[i].equals("T")) {
				jalur--;
			}
			if ((jalur == 0) &&  (arrN[i].equals("T"))) {
				gunung++;
			}else if ((jalur == 0) && (arrN[i].equals("N"))) {
				lembah++;
			}
		}
		System.out.println("Gunung yang dilewati Chester " +gunung + " gunung");
		System.out.println("Lembah yang dilewati Chester " +lembah+ " lembah");
	}
}