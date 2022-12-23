package day5.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah kartu : ");
		int kartu = input.nextInt();
		int player = kartu;
		int com = kartu;
		Random r = new Random();
		while(true) {
			System.out.println("Masukkan jumlah tawaran");
			int tawaran = input.nextInt();
			if(player >= tawaran & com >= tawaran) {
				System.out.println("Pilihan Kotak, A atau B ? ");
				String pilihan = input.next();
				int a = r.nextInt(9);
				int b = r.nextInt(9);
				if(a==b) {
					System.out.println("Kotak A = " + a);
					System.out.println("Kotak B = "+ b);
					System.out.println("SERI");
					System.out.println("Sisa Kartu Player : " + player);
					System.out.println("Sisa Kartu Computer : " + com);
				}
				else if(a>b & pilihan.equalsIgnoreCase("A") | b>a & pilihan.equals("B")) {
					System.out.println("Kotak A = " + a);
					System.out.println("Kotak B = "+ b);
					System.out.println("You Win");
					player += tawaran;
					com -= tawaran;
					System.out.println("Sisa Kartu Player : "+player);
					System.out.println("Sisa Kartu Computer : "+ com);
					if(com==0) {
						break;
					}
					
				}
				else if(a>b & pilihan.equalsIgnoreCase("B") | b>a & pilihan.equals("A")) {
					System.out.println("Kotak A = " + a);
					System.out.println("Kotak B = "+ b);
					System.out.println("You Lose");
					player -= tawaran;
					com += tawaran;
					System.out.println("Sisa Kartu Player: "+player);
					System.out.println("Sisa Kartu Computer : "+ com);
					if(player == 0) {
						break;
					}
				}
				else {
					System.out.println("\nPilihan tidak ada");
					
				}
			}
			else {
				System.out.println("\nKartu tidak cukup");
				System.out.println("Sisa Kartu Player : "+player);
				System.out.println("Sisa Kartu Computer : "+ com);
			}
			
			System.out.println("\nKetik 1 untuk keluar dari permianan");
			String exit = input.next();
			if(exit.equals("1")) {
				break;
			}
			
			
		}
		System.out.println("\nPermianan Selesai");
		
	}

}
