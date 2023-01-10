package ft1;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//berapa banyak bangun persegi sisi 'n' cm d
		//yg digunakan untuk membuat kubus rusuk 'm' cm
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input panjang sisi persegi: ");
		int n = scan.nextInt();
		
		System.out.println("input panjang rusuk kubus: ");
		int m = scan.nextInt();
		
		//kubus memiliki 6 persegi
		//6*s2
		
		int persegi=0;
		int kubus=0;
		
		int vKubus = n*n*n;
		
		//6xsxs
		
		
		int hitungKubus= (int) (6*(Math.pow(n, 2)));
		
		//System.out.println("hitung kubus "+hitungKubus);
		
		int hitungHasil = hitungKubus/m;
	
		
		System.out.println("jmlkubus "+hitungHasil);
		
	}

}
