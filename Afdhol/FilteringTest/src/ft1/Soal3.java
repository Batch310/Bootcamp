package ft1;

import java.util.Scanner;


public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//fibonaci selain nol merupakan angka genap
		
		Scanner scan = new Scanner(System.in);
		System.out.println("x: ");
		int x = scan.nextInt();
		
		int[] fibonaci = new int[x];
		
		int fib0 = 0;
		int fib1 = 1;
		int bilGenap=0;
		
		fibonaci[0] = fib0;
		fibonaci[1] = fib1;
	

		
		for (int i = 2; i < x; i++) {
			fibonaci[i] = fib0+fib1;
			fib0 = fib1;
			fib1 = fibonaci[i];
		}
		
		for (int i = 0; i < x; i++) {
			if (fibonaci[i]!=0 && fibonaci[i]%2==0) {
				bilGenap++;
			}
		}
		
		
//		System.out.println("tes");
//		for (int i : fibonaci) {
//			System.out.print(fibonaci[i]+"");
//		}
		
		System.out.println("terdapat "+bilGenap+" bilangan genap");
	}

}
//angka ganjil yagn bisa dibagi 3 dibawah x, x=10
