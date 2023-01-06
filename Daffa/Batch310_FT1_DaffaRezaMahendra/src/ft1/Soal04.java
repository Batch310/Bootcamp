package ft1;

import java.util.Scanner;

public class Soal04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukkan input : ");
		int input = scanner.nextInt();
		scanner.close();
		
		int found = 0;
		int i = 3;
		while (found < input) {
			if (i % 7 != 0) {
				System.out.print(i + " ");
				found++;
			}
			i = i + 3;
		}
	}

}