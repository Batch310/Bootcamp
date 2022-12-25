package day5.pagi;

import java.util.Scanner;

public class Soal9NinjaHattori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan jalur pendakian : ");
		String jalanNinja = input.nextLine();
		
		int lembah = 0, gunung = 0, jalan = 0;
		
		String[] arrJalanNinja = jalanNinja.split("");	
		for (int i = 0; i < arrJalanNinja.length; i++) {
			if (jalanNinja.equals("N")) {
				jalan++;
			} else if (jalanNinja.equals("T")) {
				jalan--;
			}
			
			if (arrJalanNinja[i].equals("N")&&jalan==0) {
				gunung++;
			} else if (arrJalanNinja[i].equals("T")&&jalan==0) {
				lembah++;
			}
		}
		input.close();
		System.out.println("Gunung : " + gunung);
		System.out.println("Lembah : " + lembah);
	}

}
