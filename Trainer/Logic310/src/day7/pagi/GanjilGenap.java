package day7.pagi;

import java.util.Scanner;

public class GanjilGenap {
	public static void main(String[] args) {
		
		//Inputan
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input n : ");
		int n = scanner.nextInt();
		
		//Perulangan Ganjil
		//Tugas variabel i => cetak angka ganjil
		for(int i = 1; i <= n;i = i + 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Perulangan Genap
		//Tugas variabel i => cetak angka genap
		for(int i = 2; i <= n; i = i + 2) {
			System.out.print(i + " ");
		}
	}
}
