package FinalTest1;

import java.util.Scanner;

public class Soal9 {

/*
Tian akan melakukan perjalanan ekspedisi keluar konoha dengan melewati gunung dan lembah. 
Yang didefinisikan sebagai gunung dan lembah adalah:
- Gunung: urutan Naik dan Turun yang bermula di 0 mdpl dan berakhir di 0 mdpl
- Lembah: urutan Turun dan Naik yang bermula di 0 mdpl dan berakhir di 0 mdpl
Lalu Tian mencatat perjalanannya dengan simbol N saat ia menanjak dan T saat ia turun dalam 
sebuah urutan
Contoh seperti berikut N N T N N N T T T T T N T T T N T N
Berapa Gunung dan Lembah yang sudah dilewati Tian? 
*/

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
