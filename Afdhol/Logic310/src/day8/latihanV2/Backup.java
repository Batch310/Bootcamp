package day8.latihanV2;

public class Backup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 100000;

		int poin = 0;
		int totPoin1 = 0;
		int totPoin2 = 0;
		int totPoin3 = 0;
		int sisaPulsa = 0;
		
		int sisa1=0;

		int point2 = 0;

		int pulsaAwal = input -= 10000;
		if (pulsaAwal < 0) {
			pulsaAwal *= -1;
		}

		int pulsaAwal1 = pulsaAwal - 10000;
		if (pulsaAwal1 < 0) {
			pulsaAwal1 *= -1;
		}

		if (pulsaAwal1 >= 30000) {

			// pulsaAwal1-=20000;
			
			poin = poin + (pulsaAwal1 / 1000) * 2;
			System.out.println("Sisa pulsa " + pulsaAwal1);
			System.out.println("poin3: " + poin);

			totPoin3 += poin;

			sisa1 = pulsaAwal1 - 20000;
		}
		if (sisa1 >= 1000 && sisa1 <= 30000) {
			sisa1 -= 10000;
			
			int poin1 = 0 + sisa1 / 1000;
			System.out.println("poin ke2: "+poin1);
			
//			System.out.println("sisa1: "+sisa1);
//			System.out.println("poin2 " + poin);
			totPoin2 += poin1;
		
		//	System.out.println("point2: " + totPoin2);

		}
		if (pulsaAwal >= 0 && pulsaAwal <= 10000) { // jika pulsa antara 0 sampai 10000 maka poin yang didapat adlaah 0

			poin += 0;
			sisaPulsa = pulsaAwal;

			// System.out.println("Sisa pulsa awal " + pulsaAwal);
			//System.out.println("poin1 " + poin);

		}
		System.out.println("Output : " + totPoin1 + " " + totPoin2 + " " + totPoin3);

	}
}
