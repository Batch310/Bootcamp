package day3.latihan;

public class Soal4 {

	public static void main(String[] args) {

		int n=7;
		int n2=5;
		int baris2=1;
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		
		int a = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(n2 + " ");
				n2 = n2 + 5;
			} else {
				System.out.print(a + " ");
				a  += 1;
			}
			
		}
		
	}

}
