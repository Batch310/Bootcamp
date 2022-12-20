package day2.latihan;

public class Soal9 {

	public static void main(String[] args) {

		int n = 9;

		int nilaiAwal = 4;

		for (int i = 1; i < n; i++) {

			if (i%3==0) {
				System.out.print("* ");
			}else {
				System.out.print(nilaiAwal+" ");
				nilaiAwal *=4;
			}
		
		}
	}

}
