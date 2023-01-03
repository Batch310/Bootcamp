package simulasift1;

import java.util.Scanner;

public class soal1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Ada berapa lembar kertas A6 untuk membuat selembar kartas Ax?
		
		System.out.print("input x : ");
		int x = input.nextInt();
		
//		double a6 = 2*x;
		int tampung = 1;
		if(x<1) {
			tampung = tampung+15;
			System.out.println("dibutuhkan " +tampung+ " kertas A6 untuk membuat selembar kertas A"+x);
		}else if(x<2) {
			tampung = tampung+12;
			System.out.println("dibutuhkan " +tampung+ " kertas A6 untuk membuat selembar kertas A"+x);
		}else if(x<3) {
			tampung = tampung+9;
			System.out.println("dibutuhkan " +tampung+ " kertas A6 untuk membuat selembar kertas A"+x);
		}else if(x<4) {
			tampung = tampung+6;
			System.out.println("dibutuhkan " +tampung+ " kertas A6 untuk membuat selembar kertas A"+x);
		}else if(x<5) {
			tampung = tampung+3;
			System.out.println("dibutuhkan " +tampung+ " kertas A6 untuk membuat selembar kertas A"+x);
		}else if(x<6) {
			tampung = tampung+1;
			System.out.println("dibutuhkan " +tampung+ " kertas A6 untuk membuat selembar kertas A"+x);
		}else {
			System.out.println("Kertas tidak diketahui");
		}
	}

}
