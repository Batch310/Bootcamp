package day6;

import java.util.Scanner;

public class SeparateTheNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan inputan : ");
		String inputan = scanner.nextLine();

		for (int n = 1; n < inputan.length() / 2 + 1; n++) {
			String substr = inputan.substring(0, n);
			int number = Integer.parseInt(substr);

			int index = n;
			while (true) {
				number = number + 1;
				if (inputan.indexOf(number + "", index) == index) {
					index += (number + "").length();
				} else {
					break;
				}
				if (index == inputan.length()) {
					System.out.println("YES " + substr);
					return;
				}
			}
		}
		System.out.println("NO");

	}
}
