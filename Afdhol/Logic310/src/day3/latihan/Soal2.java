package day3.latihan;

public class Soal2 {

	public static void main(String[] args) {
		int n=7;
		int n2=3;
				
		int nilaiAwal=1;
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			
			
			
			if (i%3==1) {
				System.out.print(nilaiAwal+" -");
			}else {
				System.out.print(nilaiAwal+" ");
			}
			nilaiAwal *=n2;
		}
	}

}
