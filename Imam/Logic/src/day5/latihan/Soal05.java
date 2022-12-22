package day5.latihan;

import java.util.Scanner;

public class Soal05 {

	public static void main(String[] args) {

		// L 1 orang dewasa laki = 2 piring nasgor
		// P 1 orang dewasa perempuan = 1 mie goreng
		// R 2 orang remaja =  2 mie ayam
        // A 1 anak = 1/2 nasgor
		// B 1 balita = 1 mangkok kecil bubur
		
		//jila jumlah orang ganjil P += piring nasgor
		
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Laki-laki dewasa = ");
//		int laki =scanner.nextInt();
//		
//		System.out.print("Perempuan dewasa = ");
//		int perempuan=scanner.nextInt();
//		
//		System.out.print("remaja = ");
//		int remaja = scanner.nextInt();
//		
//		System.out.print("anak = ");
//		int anak = scanner.nextInt();
//		
//		System.out.print("Balita = ");
//		int balita = scanner.nextInt();
		
		
		int orang = 0;
				
		for (int i = 0; i < 5; i++) {
			System.out.print("Laki-laki dewasa = ");
			int laki =scanner.nextInt();
			orang=orang+laki;
			
			System.out.print("Perempuan dewasa = ");
			int perempuan=scanner.nextInt();
			orang+=laki;
			
			System.out.print("Remaja = ");
			int remaja=scanner.nextInt();
			orang+=remaja;
			
			System.out.print("anak = ");
			int anak = scanner.nextInt();
			orang+=anak;
			
			System.out.print("Balita = ");
			int balita = scanner.nextInt();
			orang+=balita;	
		}
		
		System.out.print(orang);
		
		System.exit(0);
		
		
//		
//		int porsi;
//		 int jumlahPorsi=0;
//		
//		 
//		 
//		if(laki>=0) {
//			jumlahPorsi=laki*2;
//		}
//		else if(perempuan>=0) {
//			jumlahPorsi=perempuan;
//		}else if(remaja>=0) {
//			jumlahPorsi=remaja;
//		}else if(anak>=0) {
//			jumlahPorsi=anak;
//		}else if(balita>=0) {
//			jumlahPorsi=balita/2;
//		}
		
		
		
		 
		 
		
	}

}
