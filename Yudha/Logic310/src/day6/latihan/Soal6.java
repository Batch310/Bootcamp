package day6.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Input Pilihan : 1. Player main dahulu    2. Computer main dahulu");
		String pil = input.next();
		int player=0,com=0;;
		if(pil.equals("1")) {
			System.out.print("Input Angka Player   : ");
			player = input.nextInt();
			com = r.nextInt(10);
			System.out.println("Input Angka Komputer : " + com);
;		}
		else if(pil.equals("2")) {
			com = r.nextInt(10);
			System.out.println("Input Angka Komputer : x");
			System.out.print("Input Angka Player   : ");
			player = input.nextInt();
			System.out.println();
			System.out.println("Input Angka Komputer : " + com);
			System.out.println("Input Angka Player   : " + player);
		}
		else {
			System.out.println("Pilihan tidak ada");
		}
		
		if(player>com) {
			System.out.println("You Win");
		}
		else if(player<com) {
			System.out.println("You Lose");
		}
		else {
			System.out.println("Seri");
		}
	}

}
