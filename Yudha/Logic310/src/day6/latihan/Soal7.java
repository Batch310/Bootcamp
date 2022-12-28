package day6.latihan;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Soal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		System.out.print("m : ");
		int m = input.nextInt();
		System.out.print("n : ");
		int n = input.nextInt();
		int[] keranjang = new int[3];
		int a = r.nextInt(3);
		int b = r.nextInt(3);
		while(a==b) {
			b = r.nextInt(3);
		}
		keranjang[a] = m;
		keranjang[b] = n;
		for (int i = 0; i < keranjang.length; i++) {
			if(keranjang[i]==0) {
				System.out.println("Keranjang " + (i+1) + " = kosong");
			}
			else {
				System.out.println("Keranjang " + (i+1) + " = " + keranjang[i]);
			}
		}
		
		
	}

}
