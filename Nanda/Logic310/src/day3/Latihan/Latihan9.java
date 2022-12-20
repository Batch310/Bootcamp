
package day3.Latihan;

import java.util.Iterator;
import java.util.Scanner;

public class Latihan9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		System.out.print("n2 = ");
		int n2 = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+ " ");			
		}
		
		System.out.println();
		
		int a = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(a+ " ");
			a+=n2;
		}
		
		System.out.println();
		
		int b = 0;
		for (int i = 0; i < n; i++) {
			b-=n2;
			System.out.print((b+i) + " ");
			
		}
		
	}

}