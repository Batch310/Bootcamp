package simulasiFT1;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("n : ");
		int data = input.nextInt();
		
		if (data == 1) {
			System.out.println("Dibutuhkan 32 kertas A6 untuk membuat selembar kertas A" + data);
		} else if (data == 2) {
			System.out.println("Dibutuhkan 16 kertas A6 untuk membuat selembar kertas A" + data);
		} else if (data == 3) {
			System.out.println("Dibutuhkan 8 kertas A6 untuk membuat selembar kertas A" + data);
		} else if (data == 4) {
			System.out.println("Dibutuhkan 4 kertas A6 untuk membuat selembar kertas A" + data);
		} else if (data == 5) {
			System.out.println("Dibutuhkan 2 kertas A6 untuk membuat selembar kertas A" + data);
		} else if (data == 6) {
			System.out.println("Dibutuhkan 1 kertas A6 untuk membuat selembar kertas A" + data);
		}else {
			System.exit(0);
		}
		}

}
