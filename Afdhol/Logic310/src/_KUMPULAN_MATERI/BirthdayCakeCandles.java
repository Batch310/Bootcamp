package _KUMPULAN_MATERI;

import java.util.Scanner;


//Soal = menentukan berapa banyak nilai terbesar


public class BirthdayCakeCandles {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("n: ");
		int n = scan.nextInt();
		
		int[]array = new int[n];
		
		//contoh input n=4, angka = 2 4 5 5
		
		int max=0;//5
		int hasil = 0;//2
		for (int i = 0; i < array.length; i++) {
			System.out.println("Masukkan angka: ");
			array[i] = scan.nextInt();
			
			if (array[i]>max) { //i=3 , n= 5
				max = array[i]; //max 
				hasil=1;
				
			}else if (array[i]==max) {//i=
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
