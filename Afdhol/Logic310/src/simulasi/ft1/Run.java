package simulasi.ft1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int bungkusIndomie = 2;
			int garam = 100;
			int butirTelur = 3;
			int gula = 50;

			Scanner scanner = new Scanner(System.in);
			System.out.print("Masukkan n : ");
			int n = scanner.nextInt();

			bungkusIndomie = bungkusIndomie * n;
			garam = garam * n;
			butirTelur = butirTelur * n;
			gula = gula * n;

			System.out.println("Dibutuhkan " + bungkusIndomie + " bungkus indomie " + garam + " gr garam, " + butirTelur
					+ " butir telur, dan " + gula + " gr gula pasir");
		}
	}


