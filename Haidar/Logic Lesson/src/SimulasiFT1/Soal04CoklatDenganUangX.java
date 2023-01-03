package SimulasiFT1;

import java.util.Scanner;

public class Soal04CoklatDenganUangX {
	public static void main(String[] args) {
		//1 coklat dapet 1 stempel gratis.
		//Setiap 5 stempel = 1 coklat dilan gratis
		//1 coklat dialn = 1000
		//Output => Nanda mendapatkan x coklat dilan
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan uang : ");
		int uang = masukan.nextInt();
		
		int coklat = 0;
		int hargaCoklat = 1000;
		int stempel = 0;
		int nStempel = 1;
		
//		int beliCoklat = (uang/hargaCoklat);
		
		while (uang > 0) {
			uang -= hargaCoklat;
			coklat++;
			stempel++;
			if (stempel == 5*nStempel) {
				coklat++;
				nStempel++;
			}
		}		
		System.out.println("Nanda mendapatkan " + coklat + " coklat dilan");
		masukan.close();
	}
}
