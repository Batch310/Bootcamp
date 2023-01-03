package simulasiFT01;

import java.util.Scanner;

public class SimFT09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan jalur pendakian : ");
		String input = scanner.nextLine();
		scanner.close();
		
		int gunung = 0;
		int lembah = 0;
		int jalur = 0;

		String[] arrInput = input.split(" ");
		for (int i = 0; i < arrInput.length; i++) {
			if (arrInput[i].equals("N")) {
				jalur++;
			} else if (arrInput[i].equals("T")) {
				jalur--;
			}
			if ((jalur == 0) && (arrInput[i].equals("T"))) {
				gunung++;
			} else if ((jalur == 0) && arrInput[i].equals("N")) {
				lembah++;
			}
		}
		System.out.println("Gunung yang dilewati : " + gunung + " gunung");
		System.out.println("Lembah yang dilewati : " + lembah + " lembah");
	}

}
