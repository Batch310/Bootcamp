package day3.Latihan;

import java.util.Scanner;

public class Latihan4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, n2;
		System.out.print("n = ");
		n = input.nextInt();
		
		System.out.print("n2 = ");
		n2 = input.nextInt();
		
		int a=0;
		int b;
		
		for(int i=0; i<n; i++) { //01234
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0; i<n; i++) { //0,1,2,3,4
			if(i%2==0) {
				a++; //1,2,3
				System.out.print(a+" "); //1,2,3		
			}else {
				b=a*n2; //10
				System.out.print(b+" "); //5,10
			} //1,5,2,10,3
		}
	}

}
