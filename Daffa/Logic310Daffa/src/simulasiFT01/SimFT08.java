package simulasiFT01;

import java.util.Scanner;

public class SimFT08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan panjang deret : ");
		int input = scanner.nextInt();
		scanner.close();
		
		String lipat3 = "";
		
		int found = 0;
		int angka = 2;
		while (found < input) {
			lipat3 += angka + " ";
			angka = angka + 3;
			found++;
		}
		
		String[] arrLipat3 = lipat3.split(" ");
		System.out.println(lipat3);
	}

}