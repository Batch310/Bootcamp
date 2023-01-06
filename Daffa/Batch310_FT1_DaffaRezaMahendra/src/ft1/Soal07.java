package ft1;

import java.util.Scanner;

public class Soal07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

//		String bobot = " abcdefghijklmnopqrstuvwxyz";
		String bobot = " zyxwvutsrqponmlkjihgfedcba";
		String[] arrBobot = bobot.split("");

		System.out.println("Masukkan String : ");
		String huruf = scanner.nextLine();
		String[] arrHuruf = huruf.toLowerCase().split("");

		System.out.println("Masukkan Array angka : ");
		String angka = scanner.nextLine();
		String[] arrAngka = angka.split(",");

		if (arrAngka.length <= 100 && arrAngka.length >= 0) {
			for (int i = 0; i < arrAngka.length; i++) {
				String hurufSekarang = arrHuruf[i];
				String indexSekarang = arrAngka[i];
				int indexSekarangInt = Integer.parseInt(indexSekarang);
				String hurufBobotIndexSekarang = arrBobot[indexSekarangInt];

				if (hurufSekarang.equals(hurufBobotIndexSekarang)) {
					System.out.print("true ");
				} else {
					System.out.print("false ");
				}
			}
		}

		scanner.close();
	}

}
