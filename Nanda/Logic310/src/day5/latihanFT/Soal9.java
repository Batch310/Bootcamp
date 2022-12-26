package day5.latihanFT;
import java.util.Scanner;

public class Soal9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan jalur Hattori: ");
		String JalurHattori = input.nextLine();
		
		int gunung = 0;
		int lembah = 0;
		int jalur = 0;
		
		String[] arrInput = JalurHattori.split(" ");
		for (int i = 0; i < arrInput.length; i++) {
			if (arrInput[i].equals("N")) {
				jalur++;
			} else if (arrInput[i].equals("T")) {
				jalur--;
			}
			if ((jalur == 0) && (arrInput[i].equals("T"))) {
				gunung++;
			} else if ((jalur == 0) && (arrInput[i].equals("N"))) {
				lembah++;
			}
		}
		System.out.println("Gunung yang dilewati Hattori = " + gunung + " Gunung");
		System.out.println("Lembah yang dilewati Hattori = " + lembah + " Lembah");
	}
}