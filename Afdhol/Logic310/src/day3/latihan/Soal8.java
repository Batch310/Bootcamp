package day3.latihan;

public class Soal8 {

	public static void main(String[] args) {

		
		int n=7;
		int baris2=0;
		int baris3=0;
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.print(baris2+" ");
			baris2+=2;
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(baris3+" ");
			baris3+=3;
		}
	}

}
