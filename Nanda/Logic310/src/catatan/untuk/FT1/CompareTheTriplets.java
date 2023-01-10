package catatan.untuk.FT1;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] Alice = new int[3];
		int[] Bob = new int[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Masukkan Score Alice: ");
			Alice[i] = scanner.nextInt();
			}
		for (int i = 0; i < 3; i++) {
			System.out.print("Masukkan Score Bob: ");
			Bob[i] = scanner.nextInt();
		}
		System.out.println();
		
		//cetak
		for (int i = 0; i < 3; i++) {
			System.out.print(Alice[i]);
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.print(Bob[i]);
		}
		
		System.out.println();
		int skorAlice = 0;
		int skorBob = 0;
		
		for (int i = 0; i < 3; i++) {
			if(Alice[i] > Bob[i] ) {
				skorAlice++;
			}else if(Bob[i] > Alice[i]) {
				skorBob++;
			}
		}
		System.out.println();
		System.out.print(skorAlice);
		System.out.println();
		System.out.print(skorBob);
	}
}