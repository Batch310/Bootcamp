package ft1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {

	// hurufvokal
	// huruf konsonan
	// kelimpokkan huruf sama
	// huruf kecil

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("input: ");
		String input = scan.nextLine();
		
		input.toLowerCase();

		String karakter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String hurufSebelumnya ="";

		String[] arrInput = input.split("");
		Arrays.sort(arrInput);
		String hasil ="";
		
		for (int i = 0; i < arrInput.length; i++) {
			String hurufSekarang = arrInput[i]; 
			if (karakter.toLowerCase().contains(hurufSekarang)) {
				if (!hurufSekarang.equalsIgnoreCase(hurufSebelumnya)) {
					if (!hurufSebelumnya.equalsIgnoreCase("")) {
						hasil = hasil + "-";
					}
				}
				
				hasil = hasil + hurufSekarang;
												
				hurufSebelumnya = hurufSekarang; 
				
				
			}
		}
		System.out.println(hasil);
	}

}
