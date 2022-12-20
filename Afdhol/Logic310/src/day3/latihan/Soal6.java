package day3.latihan;

public class Soal6 {

	public static void main(String[] args) {

		int n = 7;

		int baris2 = 1;
		int baris3 = 1;

		int a = 1, b = 1 ;

		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			a *= n;
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print((b+i) + " ");
			b = b * n;
			//b = a + i+1;
		}


	}

}
