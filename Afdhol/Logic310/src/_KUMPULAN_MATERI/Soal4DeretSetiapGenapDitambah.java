package _KUMPULAN_MATERI;

import java.util.Scanner;

public class Soal4DeretSetiapGenapDitambah {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.println("n: ");
		int n= input.nextInt();
		
		System.out.println("n2: ");
		int n2= input.nextInt();
		
		int baris2=1;
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		// pertambahan 5 di setiap i genap
		int a = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(n2 + " ");
				n2 = n2 + 5;
			} else {
				System.out.print(a + " ");
				a  += 1;
			}
			
		}
		
	}

}
