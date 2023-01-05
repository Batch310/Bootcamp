
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
		
		for (int i = 0; i < n; i++) { //01234
			System.out.print(i+ " ");			
		}
		
		System.out.println();
		
		int a = 0;
		for (int i = 0; i < n; i++) { //0,1,2,3,4
			System.out.print(a+ " "); //0,5,10,15,20
			a+=n2; //5,10,15,20,25
		}
		
		System.out.println();
		
		for (int i = 0; i < n; i++) { //01234
			a-=n2; //20,15,10,5,0,
			System.out.print(a+ " ");			
		}
		
	}

}