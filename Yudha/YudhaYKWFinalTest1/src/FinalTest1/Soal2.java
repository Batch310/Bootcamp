package FinalTest1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan Kalimat : ");
		String kalimat = input.nextLine().toLowerCase();// kalimat berupa input yang telah diubah huruf kecil
		String[] arrayKalimat = kalimat.split(""); // yykw => y,y,k,w
		Arrays.sort(arrayKalimat);// y, y, k, w => k, w, y, y
		String alpa = "abcdefghijklmnopqrstuvwxyz";
		String alpaKalimat = "", konsonanKalimat = "";
		for (int i = 0; i < arrayKalimat.length; i++) {// perulangan untuk setiap
			// System.out.println(kalimat.charAt(i));
			if (alpa.contains(arrayKalimat[i])) {
				if(i>1) {
					if (!(alpaKalimat.contains(arrayKalimat[i]))) {
						alpaKalimat += " - ";
					}
				}
				alpaKalimat += arrayKalimat[i];
			}
		}
		System.out.println("Output : " + alpaKalimat);
	}

}
