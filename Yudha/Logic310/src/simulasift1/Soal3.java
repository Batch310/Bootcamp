package simulasift1;

import java.util.Scanner;

public class Soal3 {

/*
Diketahui X merupakan deret kelipatan 5, contoh 5,10, 15 dst..
Dan Y merupakan deret kelipatan 8, contoh 8, 16, 24, dst...
Buatlah deret sepanjang nilai input n yang dimana bilangannya ada di X dan Y.
Input :
n = 5

Output : 
40 80 120 160 200

Input :
n = 3

Output : 
40 80 120
 
*/

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
