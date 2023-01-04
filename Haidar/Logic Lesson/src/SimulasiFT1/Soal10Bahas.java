package SimulasiFT1;

import java.util.Scanner;

public class Soal10Bahas {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		//Variabel bantu bobot
		String bobot = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] arrBobot = bobot.split("");
		
		//Data statis coba
//		String x = "ABCABC";
//		String[] arrX = x.split("");
//		
//		String y = "0,1,2,1,2,3";
//		String[] arrY = y.split(",");
		
		//Data dinamis
		System.out.print("Masukkan String : ");
		String x = masukan.nextLine();
		String[] arrX = x.split("");
		
		System.out.print("Masukkan Array : ");
		String y = masukan.nextLine();
		String[] arrY = y.split(",");
		
		for (int i = 0; i < arrY.length; i++) {
			String hurufSekarang = arrX[i];
			String indexSekarang = arrY[i];
			int indexSekarangInt = Integer.parseInt(indexSekarang);
			String hurufBobotIndexSekarang = arrBobot[indexSekarangInt];
			
			if (hurufSekarang.equals(hurufBobotIndexSekarang)) {
				System.out.print("true ");
			} else {
				System.out.print("false ");
			}
		}
		masukan.close();
		
	}
}
