package day2.latihan;

public class Soal9 {

	public static void main(String[] args) {

		
		int n=7;
		
		int nilaiAwal = 4;
		
		for (int i = 0; i < n; i++) {
			System.out.print(nilaiAwal+" ");
			
			nilaiAwal*=4;
			
			if (i%4==0) {
				System.out.print("* ");
			}else {
				nilaiAwal*=4;
			}
		}
	}

}
