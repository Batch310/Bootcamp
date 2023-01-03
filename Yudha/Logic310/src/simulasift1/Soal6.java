package simulasift1;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("x = ");
		int x = input.nextInt();
		int a = 0;
		int b = 0;
		int c = 1;
		int d = 0;
		int ganjil = 1;
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		for (int i = 3; i < x; i++) {
			d = a+b+c;
			a = b;
			b = c;
			c = d;
			if(d%2!=0) {
				ganjil++;
			}
		}
		System.out.println("Sebanyak " + ganjil + " bilangan ganjil");
	}
}
