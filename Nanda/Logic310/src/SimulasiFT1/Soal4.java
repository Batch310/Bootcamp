package SimulasiFT1;

import java.util.Scanner;

public class Soal4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		
		int coklatbonus = 0;
		int stempel = 0;
		int harga = 1000;
		int coklat = (n/harga);
		int coklatt = 0;
		
		for (stempel = 0; stempel <= coklat ;stempel++) {
			if(stempel == 5) {
			coklatbonus++;
		}
			
	}
		coklatt = coklat+coklatbonus;
		System.out.print(coklatt);
	}
}


