package day3.Warmupp;

import java.util.Scanner;

public class BirthdayCakeCandles {

	
	//Soal = menentukan berapa banyak nilai terbesar
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("n: ");
		int n = scan.nextInt();
		
		int[]array = new int[n];
		
		int max=0;
		int hasil = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Masukkan angka: ");
			array[i] = scan.nextInt();
			
			if (array[i]>max) {
				max = array[i];
				hasil=1;
				
			}else if (array[i]==max) {
				hasil++;
			}
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Jumlah Terbesar Ada: "+hasil);

	}

}
