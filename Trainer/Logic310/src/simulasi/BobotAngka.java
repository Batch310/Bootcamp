package simulasi;

import java.util.Scanner;

public class BobotAngka {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input String : ");
		String string = scanner.nextLine();

		System.out.print("Input Array : ");
		String stringArray = scanner.nextLine();

		String[] arrString = string.split("");
		String[] arrArray = stringArray.split(",");

		String[] bobot = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
				"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		boolean[] arrHasil = new boolean[arrString.length];

		for (int i = 0; i < arrString.length; i++) {
			String huruf = arrString[i];
			int indexInput = Integer.parseInt(arrArray[i]);

			if (bobot[indexInput].equals(huruf)) {
				arrHasil[i] = true;
			} else {
				arrHasil[i] = false;
			}
		}

		for (int i = 0; i < arrHasil.length; i++) {
			if (i == arrHasil.length - 1) {
				System.out.print(arrHasil[i]);
			} else {
				System.out.print(arrHasil[i] + ", ");
			}
		}
	}
}
