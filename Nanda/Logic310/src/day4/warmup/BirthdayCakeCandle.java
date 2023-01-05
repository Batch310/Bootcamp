package day4.warmup;

import java.util.Scanner;

public class BirthdayCakeCandle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("n = "); //n=5
		int n = scanner.nextInt();
		
		int[] deret = new int[n]; //array dgn panjang 5
		
		for (int i = 0; i < deret.length; i++) { //01234
			System.out.print("Masukkan angka ke " +(i+1)+ " : "); //12345
			deret[i] = scanner.nextInt(); //deret = {1,2,3,4,5}
		}
		System.out.println();
		//menampilkan array
		for (int i = 0; i < deret.length; i++) {
			System.out.print(deret[i]+ " "); 
		}
		
		System.out.println();
		
		// nilai max
		int max = 0;
		int maxsum = 0;
		for (int i = 0; i < deret.length; i++) { //0,1
			if (deret[i] > max) { //{1,2
				max = deret[i]; // max = 2
				maxsum = 0;
			}
			if (deret[i] == max) {
				maxsum++; //1
			}
		}
		System.out.println("Jumlah Max : " +maxsum);
		
		System.out.println();
		}	
	}