package simulasiFT01;

import java.util.Scanner;

public class SimFT01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan x : ");
		int x = 0;
		x = scanner.nextInt();
		
		while(x<1 || x>6) {
			System.out.println("Input harus kurang dari 6 dan lebih dari nol");
			System.out.println("Masukkan x : ");
			x = scanner.nextInt();
		}
		
		int angka = (2*(int) Math.pow(2, 5-x));
		System.out.println("Dibutuhkan " + angka + " kertas A6 untuk memuat kertas A" + x);
		scanner.close();
	} 
}
