package simulasift1;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("X = ");
		int n = input.nextInt();
		int x = 5;
		int y = 8;
		String cetak = "";
		for(int i=1;i<=n;i++) {
			cetak = cetak + (x*y*i + " ");
		}
		System.out.println(cetak);
	}

}
