package simulasi.ft1;

import java.util.Scanner;

public class Soal08 {

	public static void main(String[] args) {


				Scanner scanner = new Scanner(System.in);
				System.out.print("Panjang deret = ");
				int n = scanner.nextInt();

				//2,5,8,11
				//2,4,6
				// Bilangan Positif
				int[] arrA = new int[n];

				int found = 0; 
				

					for (int i = 3; i < arrA.length ; i=i+3) {
						int bil = 3; 
						if (bil % 3 == 0) { 
							bil = bil-1;	
						}
						bil+=3;
					}
					
				for (int x : arrA) {
					System.out.print(x + " ");
				}

			System.out.println();
			int[] arrB = new int[n];
			

				int[] arrSum = new int[n];
				for (int i = 0; i < arrA.length; i++) {

					arrSum[i] = arrA[i] + arrB[i];
				}

				for (int i : arrSum) {
					System.out.print(i + ", ");
				}

			}

		}

		
		
		

	
