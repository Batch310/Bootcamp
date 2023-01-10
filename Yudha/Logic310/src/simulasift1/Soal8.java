package simulasift1;

import java.util.Scanner;

public class Soal8 {
	
/*
Buatlah deret angka yang terbentuk dari penjumlahan deret bilangan kelipatan 4 dikurang 1 
dan deret bilangan kelipatan 3 diibagi(/) 2. Angka pada index ganjil dari kedua deret bilangan 
tersebut saling dijumlahkan. Dan angka pada index genap dari kedua deret bilangan tersebut juga 
saling dijumlahkan. Index dimulai dari angka 0.
Input : Panjang array/panjang deret
Contoh : Dibawah ini hanya sekedar contoh yang menggunakan deret genap dan ganjil
Input panjang deret : 5

Deret genap : 0 2 4 6 8
Deret ganjil : 1 3 5 7 9

0 + 1 ; 2 + 3 ; 4 + 5 ; 6 + 7 ; 8 + 9

Output : 1, 5, 9, 13, 17 
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input Panjang Deret : ");
		int n = input.nextInt();
		int x = 0;
		int y=0;
		String aArray = "", bArray="", aPlushb="";
		for (int i = 0; i < n; i++) {
			x = x+3;
			aArray = aArray + (x-1) + " ";
		}
		
		System.out.println(aArray);
		
		for (int i = 0; i < n; i++) {
			y = y+4;
			bArray = bArray + (y/2) +" ";
		}
		
		System.out.println(bArray);
		
		String[] arrayA = aArray.split(" ");
		String[] arrayB = bArray.split(" ");
		for (int i = 0; i < n; i++) {
			int jumlah = Integer.parseInt(arrayA[i])+Integer.parseInt(arrayB[i]);
			aPlushb += jumlah+" ";
			
		}
		System.out.println(aPlushb);
	}

}
