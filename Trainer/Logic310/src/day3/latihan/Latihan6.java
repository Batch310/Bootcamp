package day3.latihan;

public class Latihan6 {
	public static void main(String[] args) {
		// n = 7
		// 0 1 2 3 4 5 6
		// 1 7 49 343 2401 .....
		// 1 8 51 346 2405

		int n = 7;

		// baris 1
		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();

		int a = 1;
		// baris 2
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			a = a * n;
		}
		
		System.out.println();
		
		//baris 3
		int b = 1;
		for (int i = 0; i < n; i++) {
			System.out.print((b+i)+" ");
			b = b * n;
		}
	}
}
