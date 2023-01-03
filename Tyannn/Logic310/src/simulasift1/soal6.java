package simulasift1;

import java.util.Scanner;

public class soal6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("input x : ");
		int n = input.nextInt();

		int[] fibonacci = new int[n];

		int fibo0 = 0; 
		int fibo1 = 0; 
		int fibo2 = 1;
		fibonacci[0] = fibo0;
		fibonacci[1] = fibo1;
		fibonacci[2] = fibo2;
		

		for (int i = 2; i < n; i++) { 
			fibonacci[i] = fibo0 + fibo1 + fibo2;
			fibo0 = fibo1;
			fibo1 = fibonacci[i];
		}


		int tampung = 1;
		for (int i = 0; i < n; i++) {
			if(fibonacci[i]%2==0) {
				
			}else {
				tampung++;
				System.out.print("Sebanyak "+tampung+" bilangan ganjil");
				
			}

			System.out.println();

		}

	}

}
