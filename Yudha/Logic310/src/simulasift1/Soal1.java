package simulasift1;

import java.util.Scanner;

public class Soal1 {
/*
    Ada berapa lembar kertas A6 yang bisa disatukan untuk membuat selembar kertas berukan Ax?
	Constraint :  0 < x < 6
	Input :
	X = 5

	Output : 
	Dibutuhkan 2 kertas A6 untuk membuat selembar kertas A5
		Input :
	X = 4

	Output : 
	Dibutuhkan 4 kertas A6 untuk membuat selembar kertas A4

*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("X = ");
		int x = input.nextInt();
		int kertasA = 6;
		int jumlah = 0;
		for(int i=1;kertasA>x;i++) {
			jumlah = (int) Math.pow(2, i);
			kertasA--;
		}
		System.out.println("Dibutuhkan "+ jumlah + " kertas A6 untuk membuat selembar kertas A" + x);
	}

}
