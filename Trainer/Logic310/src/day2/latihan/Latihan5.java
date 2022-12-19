package day2.latihan;

public class Latihan5 {
	public static void main(String[] args) {
		// output
		// 1 5 * 9 13 * 17

		int n = 7;
		int nilaiAwal = 1;

		for (int i = 0; i < n; i++) {
			// i :
			// 0,1,2,3,4,5,6
			// 0,1,*,3,4,*,6
			
			//Rumus Bintang
			//2, 5, 8, 11, ... (dibagi 3 selalu sisa 2)
			//i % 3 == 2
			if(i % 3 == 2) {
				System.out.print("* ");
			} else {
				System.out.print(nilaiAwal + " ");
				nilaiAwal += 4; // nilaiAwal = nilaiAwal + 4;
			}
		}
	}
}
