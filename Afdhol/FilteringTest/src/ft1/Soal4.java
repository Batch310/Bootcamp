package ft1;

import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// nemapilkan kelipatan 3 yg merupakan genap

		Scanner scan = new Scanner(System.in);
		System.out.println("n: ");
		int n = scan.nextInt();
		
		int found=0;
		int i = 3;
		while (found<n) {
			if (i%2==0) {
				System.out.print(i+" ");
				found++;
			}
			i+=3;
		}

	}

}
