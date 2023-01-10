package ft1;

import java.util.Scanner;

public class Soal6 {
	
	//gunung mulai dari 0 
	//lembah mulai dari 0
	// n = naik
	// t = turun

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Perjalanan: ");
		String rute = scan.nextLine();
		
		String[] arrRute = rute.split("");
		
		int awal =0;
		
		int gunung =0;
		int lembah = 0;
		
		int max =0;
		int min =0;
		
		for (int i = 0; i < arrRute.length; i++) {
			if (arrRute[i].equalsIgnoreCase("N")) {
				awal++;
				if (awal>max) {
					max=awal;
				}
				
			}else if (arrRute[i].equalsIgnoreCase("T")) {
				awal--;
				if (awal<min) {
					min=awal;
				}
			}
		if (awal==0 && arrRute[i].equalsIgnoreCase("N")) {
			lembah++;
			if (awal<min) {
				min = awal;
			}
			
			
		}else if (awal == 0 && arrRute[i].equalsIgnoreCase("T")) {
			gunung++;
		}		
			
	}

		System.out.print("Gunung : "+gunung);
		System.out.println();
		System.out.print("Lembah : "+lembah);
		System.out.println();
		System.out.println("tertinggi "+max);
		System.out.println("terendah "+ min);
	}

}
