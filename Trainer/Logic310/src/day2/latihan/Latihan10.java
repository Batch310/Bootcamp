package day2.latihan;

public class Latihan10 {
	public static void main(String[] args) {
		//n = 7
		//3 9 27 XXX 243 729 2187
		//0 1 2  3    4   5   6
		
		int n = 9;
		int a = 3;
		
		for (int i = 0; i < n; i++) {
			if(i == n/2) {
				System.out.print("XXX ");
			} else {
				System.out.print(a+" ");
			}
			a = a * 3;
		}
		
		
	}
}
