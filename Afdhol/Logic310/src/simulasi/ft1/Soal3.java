package simulasi.ft1;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//x deret kelipatan 5 5,10,15
		//y deret kelipatan 8 8,16,24
		
		//buat deret sepanjang n dimana bilangannya ada di x dan y
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("n: ");
//		int input = scan.nextInt();
		
		int input = 5;
		int x = 0;
		int y=0;
		
		for (int i = 1; i <= input; i++) {
			 x = i*5;
			//System.out.print(x+" ");
			if (x%i==0) {
				System.out.print(x+" ");
			}
		}
		
		System.out.println();
		
		for (int j = 1; j <= input; j++) {
			 y = j*8;
			System.out.print(y+" ");
			
		}
		
		
		System.out.println();
		System.out.print(x);
		
	}

}
