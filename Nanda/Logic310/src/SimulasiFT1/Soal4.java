package SimulasiFT1;

import java.util.Scanner;

public class Soal4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		int eslolibonus = 0;
		int stik = 0;
		int harga = 1000;
		int esloli = 0;
		int eslolitotal = 0;
		
		for (esloli = 0; esloli < (n/harga) ; esloli++) {
			stik++;
			if(stik %5 == 0 && stik > 0) {
			eslolibonus++;
		}
	}
		eslolitotal = esloli + eslolibonus;
		System.out.print("Nanda mendapatka " +eslolitotal+ " coklat dilan");
	}
}