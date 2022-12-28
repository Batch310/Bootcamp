package day8.latihanExam;

import java.util.Scanner;

public class KonversiVolume {

	public static void main(String[] args) {
		// 1 Botol = 2 gelas => 5 cangkir (1 gelas = 2.5 cangkir)
		// 1 teko = 25 cangkir => 10 gelas
		// 1 gelas =2.5 cangkir

		Scanner scanner = new Scanner(System.in);
		System.out.print("Komversi dari = 1  ");
		String a = scanner.nextLine();
		System.out.print(" ke ");
		String b = scanner.nextLine();

		double botol = 0;
		double gelas = 0;
		double teko = 0;
		double cangkir = 0;

		if (a.equalsIgnoreCase("botol")) {
			if (b.equalsIgnoreCase("gelas")) {
				gelas += 2;
			}else if(b.equalsIgnoreCase("cangkir")){
			
			}
		}

	}

}
