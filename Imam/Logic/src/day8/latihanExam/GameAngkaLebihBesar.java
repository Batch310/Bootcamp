package day8.latihanExam;

import java.util.Random;
import java.util.Scanner;

public class GameAngkaLebihBesar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random r = new Random();

		System.out.print("1. Player main dahulu");
		System.out.println();
		System.out.print("2. Computer main dahulu");
		System.out.println();
		System.out.print("Input Plilhan = ");
		int input = scanner.nextInt();

		if (input == 1) {

			System.out.print("Input angka anda = ");
			int player = scanner.nextInt();
			int com = r.nextInt(10);

			if (player > com) {
				System.out.println("Angka anda = " + player);
				System.out.println("Angka computer = " + com);
				System.out.print("You Win");

			} else {
				System.out.println("Angka anda = " + player);
				System.out.println("Angka computer = " + com);
				System.out.print("You lose");
			}

		}

		if (input == 2) {

			int com = r.nextInt(10);
			System.out.println("Computer sudah punya angka!");
			System.out.print("Input angka anda = ");
			int player = scanner.nextInt();

			if (player > com) {
				System.out.println("Angka computer = " + com);
				System.out.println("Angka anda = " + player);
				System.out.print("You Win");

			} else {
				System.out.println("Angka computer = " + com);
				System.out.print("You lose");
				System.out.println("Angka anda = " + player);
			}

		}

	}

}
