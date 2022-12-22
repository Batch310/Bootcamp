package day4.strings;

import java.util.Scanner;

public class MarsExploration {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan pesan SOS: ");
		
		String sosMess = masukan.nextLine();
		
		int panjangInput = sosMess.length();
		int banyakSOS = panjangInput/3;
		String[] sosMessage = sosMess.split("");
		String sos = "SOS";
		int difference = 0;
		
//		for (int i = 0; i < sosMessage.length; i++) {
//			sosMessage[i] = sosMess.substring(((i*3)), ((i*3)+3));
//			System.out.println(sosMessage[i]);
//		}
		
		for (int i = 0; i < banyakSOS; i++) {
			for (int j = i * 3; j < (i * 3) + 3; j++) {
				if (!(sos.contains(sosMessage[j]))) {
					difference ++;
				}
			}
		}
		System.out.println(difference);
		
	}
}
