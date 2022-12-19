package day2.latihan;

import java.util.Scanner;

public class Latihan5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, awal=1;
		
		System.out.print("n = ");
		n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			//i:
			//0,1,2,3,4,5,6
			//0,1,*3,4,*,6
			if(i%3==0) {
				System.out.print("* ");
			}else {
				System.out.print(awal+ " ");
				awal+=4;
			}
		}
	}

}
