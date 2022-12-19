package day2.latihan;

public class Latihan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 7;
		int nilaiAwal = 1;

		for (int i = 0; i < n; i++) {
			if (i % 3 == 2) {
				System.out.print("* ");
//			} else if (i == 5) {
//				System.out.print("* ");
			} else {
				System.out.print(nilaiAwal + " ");
				nilaiAwal += 4;
			}

		}

	}

}
