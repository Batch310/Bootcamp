package day4.Strings;

import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukkan pesan SOS : ");
		
		String sosMess = scanner.nextLine();
		int panjangInput = sosMess.length();
		int banyakSOS = panjangInput/3;
		String[] sosMessage = sosMess.split("");
		String sos = "SOS";
		int difference = 0;
		
		for (int i = 0; i < banyakSOS; i++) {
			for (int j = i * 3; j < (i *3) + 3; j++) {
				if(!(sos.contains(sosMessage[j]))) {
					difference++;
				}
			}
		}
		System.out.println(difference);
		scanner.close();
	}

}
