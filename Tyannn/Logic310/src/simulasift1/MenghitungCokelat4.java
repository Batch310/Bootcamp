package simulasift1;

import java.util.Scanner;

public class MenghitungCokelat4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1 cokelat = 1 stempel gratis
		// 5 stempel = 1 cokelat
		// jika 1 cokelat 1000 
		// berapa jumlah coklat dengan uang X?
		// inout n = 10000						n=20000
		// output nanda mendapatkan 12 cokelat	nanda mendapatkan 24 cokelat dilan
		
		System.out.println("input n : ");
		int n = input.nextInt();
		
		int bonus =(n/5)/1000;
		int total=(n/1000)+bonus;	
		
		System.out.print("Nanda mendapatkan "+total+" Coklat dilan");
	}

}
