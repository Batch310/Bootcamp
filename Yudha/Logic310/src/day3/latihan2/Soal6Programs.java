package day3.latihan2;

import java.util.Scanner;

public class Soal6Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new  Scanner(System.in);	
		System.out.println("Kalimat : ");
		String kalimat = input.nextLine().toLowerCase();
		//System.out.println(kalimat);
		String [] alpa = "abcdefghijklmnopqrstuvwxyz".split("");
		boolean program = true;
		for (int i = 0; i < alpa.length; i++) {
			//System.out.println(alpa[i]);
			if(kalimat.contains(alpa[i])) {
				//System.out.println(alpa[i]);
				continue;
			}
			else {
				program = false;
				break;
			}
			
		}
		if(program==true) {
			System.out.println("program");
		}
		else {
			System.out.println("not program");
		}
	}

}
