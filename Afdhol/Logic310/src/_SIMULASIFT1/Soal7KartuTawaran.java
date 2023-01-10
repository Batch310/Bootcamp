package _SIMULASIFT1;

import java.util.Random;
import java.util.Scanner;

public class Soal7KartuTawaran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner masukan = new Scanner(System.in);
		Random random = new Random();
		
		//Program yang diinginkan
		//Input berupa jumlah kartu sebanyak n, Jumlah tawaran sebanyak n, Pilihan kotak A atau B
		//1. Player dan Komputer diberi kartu masing - masing sebanyak n
		//2. Komputer akan mengacak angka 0 sampai 9 dan memilih 2 angka secara rahasia dan dimasukkan ke dalam kotak A & B
		//3. Lalu Player akan memasang tawaran sejumlah m kartu.
		//4. Player memilih salah satu kotak antara kotak A atau kotak B
		//5. Jika angka pada kotak yang dipilih Player lebih besar, maka Player dapet kartu Player dan Komputer sebanyak m
		//6. Jika angka pada kotak yang dipilih Player lebih kecil, maka kartu Player sebanyak m ke Komputer
		//7. Permainan berakhir jika kartu n Player atau Komputer habis, atau Player menyerah
		
		System.out.print("Masukkan jumlah kartu atau gambaran: ");
		int kartu = masukan.nextInt();
		
		//memasukkan inputan sama antara player dengan komputer
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
				
				System.out.print("Memilih kotak A, B, atau Menyerah? ");
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
				} else if (kotak.equals("Menyerah")) {
					System.out.println("Permainan berakhir, kamu telah menyerah");
					System.exit(0);
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
//			System.out.println((kartu*2));
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
