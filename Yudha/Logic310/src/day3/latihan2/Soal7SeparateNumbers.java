package day3.latihan2;

import java.util.Iterator;
import java.util.Scanner;

public class Soal7SeparateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan Angka : ");
		String angka = input.next();
		for (int i = 0; i < angka.length()-1; i++) {
			int a = Integer.parseInt(angka.substring(i,(i+1)));
			int b = Integer.parseInt(angka.substring(i+1,(i+2)));
			if(b == a+1) {
				System.out.print(a);
				System.out.println(b);
			}
			else {
				break;
			}
		}
		for (int i = 0; i < angka.length()-1; i=i+2) {
			int a = Integer.parseInt(angka.substring(i,(i+2)));
			int b = Integer.parseInt(angka.substring(i+2,(i+4)));
			if(b == a+1) {
				System.out.print(a);
				System.out.println(b);
			}
			else {
				break;
			}
		}
		
	}

}
