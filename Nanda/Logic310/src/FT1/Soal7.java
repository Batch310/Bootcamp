package FT1;

import java.util.Scanner;

public class Soal7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String bobot = " abcdefghijklmnopqrstuvwxyz";
		String[] arrBobot = bobot.split("");
		
		System.out.print("Masukkan kata/kalimat : ");
		String kata = scanner.nextLine();
		String[] arrX = kata.split("");
		
		System.out.print("Masukkan Array : ");
		String arr = scanner.nextLine();
		String[] arrY = arr.split(", ");
		
		for (int i = 0; i < arrY.length; i++) {
			String hurufSekarang = arrX[i];
			String indexSekarang = arrY[i];
			int indexSekarangInt = Integer.parseInt(indexSekarang);
			String hurufBobotIndexSekarang = arrBobot[indexSekarangInt];
			
			if(hurufSekarang.equals(hurufBobotIndexSekarang)) {
				System.out.print("true ");
			}else {
				System.out.print("false ");
			}
		}
	}

}
