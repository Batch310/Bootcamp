package day4.latihan.exam;

public class Soal8 {

	public static void main(String[] args) {

		int n = 7;
		int bil1 = 0, bil2 = 0, temp = 0;

		for (int i = 1; i <= n; i++) { // sejumlah n

			if (bil1 < i && i == 1) {
				System.out.print(i + " ");
				bil1 = i; // set variabel param1 dengan nilai i=1
			}
			if (bil2 < bil1) {

				temp = bil1 + bil2;
				System.out.print(temp + " ");
				bil2 = temp; // update param2
			}
			if (i > 2) {

				temp = bil1 + bil2;
				System.out.print(temp + " ");
				bil1 = bil2; // update param1
				bil2 = temp; // update param2
			}
		}
	}

}
