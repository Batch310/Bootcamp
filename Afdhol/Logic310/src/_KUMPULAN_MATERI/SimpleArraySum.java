package _KUMPULAN_MATERI;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("n: ");
	
		
		int input = scan.nextInt();

		int[]arrayInput = new int[input];
		

		System.out.println();
		int jumlah = 0;

		for (int i = 0; i <arrayInput.length; i++) {
			System.out.println("angka "+i+": ");
			arrayInput[i] = scan.nextInt();
			jumlah +=arrayInput[i];
			

		}
		System.out.println();
		System.out.println("jumlah: " + jumlah);
	}
}
