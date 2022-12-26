package day5.latihanFT;

import java.util.Random;
import java.util.Scanner;

public class Soal7 {

	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
		Random random = new Random();
				
		System.out.print("Masukkan jumlah kartu atau gambaran: ");
		int kartu = masukan.nextInt();
		
		int kartuKomputer = kartu;
		int kartuPlayer = kartu;
		
		int angkaA = 0;
		int angkaB = 0;
		
		while ((kartuPlayer < (kartu*2))) {
			
			int random1 = random.nextInt(10);
			int random2 = random.nextInt(10);
			
			System.out.print("Masukkan jumlah tawaran: ");
			int tawaran = masukan.nextInt();
			
			if ((tawaran <= kartuPlayer) && (tawaran <= kartuKomputer)) {
				angkaA = random1;
				angkaB = random2;
				
				System.out.print("Memilih kotak, A atau B? ");
				String kotak = masukan.next();
				
				if (kotak.equals("A") && (angkaA > angkaB)) {
					kartuPlayer += tawaran;
					kartuKomputer -= tawaran;
				} else if (kotak.equals("B") && (angkaB > angkaA)) {
					kartuPlayer += tawaran;	
					kartuKomputer -= tawaran;
				} else if ((kotak.equals("A") && angkaA == angkaB) || (kotak.equals("B") && angkaB == angkaA)) {
					kartuPlayer += 0;
					kartuKomputer += 0;
				} else {
					kartuPlayer -= tawaran;
					kartuKomputer += tawaran;
				}
				System.out.print("Kotak A: " + angkaA);
				System.out.println(" Kotak B: " + angkaB);				
			} else {
				System.out.println("Kartu tawaran kurang, masukkan tawaran kurang dari atau sama dengan kartu Player atau kartu Komputer");
			}
			System.out.print("Kartu Player: " + kartuPlayer);
			System.out.println(" Kartu Komputer: " + kartuKomputer);
			if (kartuKomputer == kartu*2) {
				System.out.println("You Lose");
				System.exit(0);
			}
		}
		
		if (kartuKomputer == 0) {
			System.out.println("You Win");
		}
		
	}

}
