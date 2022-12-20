package day3.latihan;

public class Soal3 {

	public static void main(String[] args) {

		int n = 7;
		int n2 = 3;
		int nilaiAwal = 3;

		for (int i = 0; i < n; i++) {
			System.out.print(i + "   ");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			if (i <n/2) {
				System.out.print(nilaiAwal+" ");
				nilaiAwal *= 2;
			} else {
				
				System.out.print(nilaiAwal + " ");
				nilaiAwal/=2;

			}

		}

	}

}
