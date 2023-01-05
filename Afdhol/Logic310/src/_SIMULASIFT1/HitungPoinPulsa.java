package _SIMULASIFT1;

import java.util.Scanner;

public class HitungPoinPulsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Program point pulsa
				// constraint :
				// 0-10000 = 0 poin
				// 10001-30000 = 1 poin (kelipatan 1000)
				// bila di atas 30000 = 2 poin
		
		Scanner masukan = new Scanner(System.in);

		System.out.print("Beli Pulsa Rp.");
		int pulsa = masukan.nextInt();

		int poin = 0;
		int poin1 = 0;
		int poin2 = 0;
		int totalPoin = poin + poin1 + poin2;

		if (pulsa <= 10000) {
			poin = 0;
			totalPoin = poin;
			System.out.println(poin + " point");
		} else if (pulsa > 10000 && pulsa <= 30000) {
			pulsa -= 10000;
			poin1 = (pulsa / 1000);
			totalPoin = poin1;
			System.out.println(poin + " + " + poin1 + " = " + totalPoin + " point");
		} else {
			poin1 = (20000) / 1000;
			pulsa -= 30000;
			poin2 = ((pulsa / 1000) * 2);
			totalPoin = poin1 + poin2;
			System.out.println(poin + " + " + poin1 + " + " + poin2 + " = " + totalPoin + " point");
		}
	}

}
