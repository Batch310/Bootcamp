package FinalTest1;

import java.util.Scanner;

public class Soal4TriFibo {

/*
Setiap pembelian 1 coklat dilan di alfaapril akan mendapatkan 1 stempel gratis dari mba Kasir. Setiap 5 stempel dapat ditukar dengan 1 coklat dilan gratis. Jika Nanda membeli beberapa coklat dilan, Memakannya, kemudian mengumpulkan stempelnya untuk ditukar ke coklat dilan gratis. Jika harga 1 coklat dilan adalah 1000. Berapakah jumlah maksimal coklat dilan yang bisa didapatkan Nanda dengan uang X?
Input :
n = 10000

Output : 
Nanda mendapatkan 12 coklat dilan

Input :
n = 20000

Output : 
Nanda mendapatkan 24 coklat dilan

*/	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan x : ");
		int x = scanner.nextInt();

		int a = 0;
		int b = 0;
		int c = 1;

		int bilSaatIni = 1;
		int countGanjil = 0;
		while (bilSaatIni < x) {
			if (bilSaatIni % 2 != 0) {
				countGanjil++;
			}
			System.out.println(bilSaatIni);
			bilSaatIni = a + b + c;
			a = b;
			b = c;
			c = bilSaatIni;
		}
		
		System.out.println("Sebanyak " + countGanjil + " bilangan ganjil");
	}

}
