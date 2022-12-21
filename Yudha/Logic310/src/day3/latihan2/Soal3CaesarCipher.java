package day3.latihan2;

import java.util.Scanner;

public class Soal3CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan panjang Original Alphabet : ");
		int panjang = input.nextInt();
		System.out.println("Masukkan Original Alphabet : ");
		String ori = input.next();
		String [] arrayOri = ori.split(""); 
		System.out.println("Masukkan Lompatan : ");
		int lompatan = input.nextInt();
		
//		for (int i = 0; i < arrayOri.length; i++) {
//			if(alpa.contains(arrayOri[i])) {
//				
//					
//				}
//			}
//		}
		String hasil = "";
		for (int i = 0; i < ori.length(); i++) {
			System.out.println(ori.charAt(i));
			// mendapatkan index setiap karakter
			int indexHuruf = lower.indexOf(ori.charAt(i));
			//
			int indexLompatanHuruf = (lompatan + indexHuruf) % 26;
			char lompatanHuruf = lower.charAt(indexLompatanHuruf);
			hasil += lompatanHuruf;
		}
		System.out.println(hasil);
		
	}

}
