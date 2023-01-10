package FinalTest1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan Huruf : ");
		String[] huruf = input.nextLine().split("");
		System.out.println("Masukkan Angka : ");
		String[] angka = input.nextLine().split(", ");
		String[] alpa = "abcdefghijklmnopqrstuvwxyz".split("");
		String indexHuruf = "";
		String hasil = "";
		for (int i = 0; i < huruf.length; i++) {
			for (int j = 0; j < alpa.length; j++) {
				if(huruf[i].equals(alpa[j])) {
					indexHuruf += (j+1) +", ";
					break;
				}
			}
		}
		String[] indexHurufA = indexHuruf.split(", ");
		for (int i = 0; i < angka.length; i++) {
			hasil += (angka[i].equals(indexHurufA[i])) + " ";
					}
		System.out.println(indexHuruf);
		System.out.println(hasil);
	}

}
