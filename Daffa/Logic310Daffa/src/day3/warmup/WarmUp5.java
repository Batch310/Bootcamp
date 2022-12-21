package day3.warmup;

import java.util.Scanner;

public class WarmUp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan n : ");
		int n = input.nextInt();
		int deret[] = new int[n];

		int pos, neg, zero;
		pos = 0;
		neg = 0;
		zero = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Masukkan angka : ");
			deret[i] = input.nextInt();
			if (deret[i] > 0) {
				pos++;
			} else if (deret[i] < 0) {
				neg++;
			} else if (deret[i] == 0) {
				zero++;
			}
		}
		float a=0f,b=0f,c=0f;
        a = (float)pos/n;
        b = (float)neg/n;
        c = (float)zero/n;
        System.out.printf("%.6f \n",a);
        System.out.printf("%.6f \n",b);
        System.out.printf("%.6f",c);

	}
}