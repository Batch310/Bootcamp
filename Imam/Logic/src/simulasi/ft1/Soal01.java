package simulasi.ft1;

import java.util.Scanner;

public class Soal01 {

	public static void main(String[] args) {
		
		Scanner inputan = new Scanner(System.in);
		System.out.print("Masukkan x = ");
		int x = inputan.nextInt();
		
		int aX = x;
		int kertas = 1;
		
		if(x==6) {
			kertas=kertas;
		}
		
		if(x==5) {
			kertas=2*kertas;
		}
		
		if(x==4) {
			kertas=4*kertas;
		}
		
		if(x==3) {
			kertas=6*kertas;
		}
		if(x==2) {
			kertas=8*kertas;
		}
		
		if(x==1) {
			kertas=10*kertas;
		}
		
		
		System.out.println("Dibutuhkan " + kertas + " kertas A6 "+"untuk membuat selembar kertas A"+ x);

	}

}
