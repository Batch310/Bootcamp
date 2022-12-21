package day3.latihan2;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal1CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan kalimat : ");
		String kalimat = input.next();
		String [] huruf = kalimat.split("");
		int word = 1;
		for (int i = 0; i < huruf.length; i++) {
			if(huruf[i].equals(huruf[i].toUpperCase())) {
				word++;
			}
		}
		System.out.println(word);
	}

}
