package simulasift1;

import java.util.Scanner;

public class Soal9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan Input : ");
		String [] inputan = input.nextLine().split(" ");
		int y = 0,gunung=0,lembah=0;
		for (int i = 0; i < inputan.length; i++) {
			if(inputan[i].equals("N")) {
				y++;
			}
			else if(inputan[i].equals("T")) {
				y--;
			}
			if(y==0) {
				if(inputan[i].equals("N")) {
					lembah++;
				}
				else if(inputan[i].equals("T")) {
					gunung++;
				}
				
			}
		}
		System.out.println("Gunung : " + gunung);
		System.out.println("Lembah : " + lembah);
	}

}
