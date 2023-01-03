package simulasiFT01;

import java.util.Scanner;

public class SimFT06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan deret : ");
		int deret = scanner.nextInt();
		scanner.close();

		String tribonacci = "";
		int tribo = 0, foundGanjil = 0, tri1 = 0, tri2 = 0, tri3 = 1;

		while (tribo < deret) {
			int nextTribo = 0;
			tribonacci += tri1 + " ";
			nextTribo = tri1 + tri2 + tri3;
			tri1 = tri2;
			tri2 = tri3;
			tri3 = nextTribo;
			tribo++;
		}
		
		for (int j = 0; j < deret; j++) {
			String[] arrTribonacci = tribonacci.split(" ");
			int convertTribo = Integer.parseInt(arrTribonacci[j]);
			if (convertTribo % 2 == 1) {
				foundGanjil++;
			}
		}
		
		System.out.println(tribonacci);
		System.out.println("Terdapat " + foundGanjil + " bilangan ganjil");
	}

}
