package simulasift1;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("X = ");
		int x = input.nextInt();
		int a6 = 6;
		int jumlah = 0;
		for(int i=1;a6>x;i++) {
			jumlah = (int) Math.pow(2, i);
			a6--;
		}
		System.out.println("Dibutuhkan "+ jumlah + " kertas A6 untuk membuat selembar kertas A" + x);
	}

}
