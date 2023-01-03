package SimulasiFT1;

import java.util.Iterator;
import java.util.Scanner;

public class Soal3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		int[] kelipatan5 = new int[] {5, 10, 15, 20, 25, 30, 35, 40};
		int[] kelipatan8 = new int[] {8, 16, 24, 32, 40};
		int[] KPK = new int [n];
		
		for (int i = 0; i < n; i++) {
			if (kelipatan5[i] == kelipatan8[i]) {
				KPK[i] = kelipatan5[i] + kelipatan8[i];
				System.out.print(KPK[i]);
			}
		}
		
	}

}
