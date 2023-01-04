package SimulasiFT1;

import java.util.Scanner;

public class Soal02IndomieSuper {
	public static void main(String[] args) {
		//1 indomie super = 2 indomie + 100gr garam + 3 butir telur + 50gr gula pasir
		//n indomie super = n*2 indomie + n*100gr garam + n*3 butir telur + n*50gr gula pasir
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.println("Masukkan nilai n : ");
		int n = masukan.nextInt();
		
		int jumlahIndomie = (n*2);
		int jumlahGaram = (n*100);
		int jumlahTelur = (n*3);
		int jumlahGulaPasir = (n*50);
		
		//int indomieSuper = jumlahIndomie + jumlahGaram + jumlahTelur + jumlahGulaPasir;
		
		System.out.println("Dibutuhkan " + jumlahIndomie + " bungkus indomie, " + jumlahGaram + " gr garam, " + jumlahTelur + " butir telur, dan " + jumlahGulaPasir + " gr gula pasir.");
		masukan.close();
		
	}
}
