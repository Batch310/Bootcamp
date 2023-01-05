package simulasi;

import java.util.Scanner;

public class GunungLembah {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan Rute : ");
		String ruteInput = scanner.nextLine();
		
		String[] arrRute = ruteInput.split(" ");
		
		int mdpl = 0;
		int gunung = 0;
		int lembah = 0;
		
		for (int i = 0; i < arrRute.length; i++) {
			String rute = arrRute[i];
			if (rute.equals("N")) {
				mdpl++;
				if (mdpl == 0) {
					lembah++;
				}
			} else {
				mdpl--;
				if(mdpl == 0) {
					gunung++;
				}
			}
		}
		
		System.out.println("Lembah : " + lembah +", Gunung : " + gunung);
		
		
	}
}
