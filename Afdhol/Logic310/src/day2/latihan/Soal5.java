package day2.latihan;

public class Soal5 {

	public static void main(String[] args) {

		int n = 11;

		int nilaiAwal = 1;

		for (int i = 0; i < n; i++) {
			// ini i:
			// 0,1,2,3,4,5,6
			// 0,1,*,3,4,*,6

			// rumus bintang
			// 2,5,8,11,.....(dibagi 3 selalu sisa 2)
			// jadi i%3==2

			if (i % 3 == 2) {
				System.out.print("* ");
			} else {
				System.out.print(nilaiAwal + " ");
				nilaiAwal += 4; // nilai awal= nilai awal_4
			}
		}

	}

}
