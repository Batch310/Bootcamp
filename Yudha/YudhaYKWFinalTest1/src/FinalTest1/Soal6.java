package FinalTest1;

import java.util.Scanner;

public class Soal6 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Inputan = ");
		String[] inputan = input.nextLine().split(" ");
		int y=0,lembah=0,gunung=0;
		int max = 0, min =0;
		for (int i = 0; i < inputan.length; i++) {
			if(inputan[i].equals("N")) {
				y++;
				if(y >= max) {
					max = y;
				}
			}
			else if(inputan[i].equals("T")) {
				y--;
				if(y <= min) {
					min = y;
				}
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
		System.out.println("Gunung = " + gunung);
		System.out.println("Lembah = " + lembah);
		System.out.println(max);
		System.out.println(min);
		
	}
}
