package FinalTest1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Panjang Deret : ");
		int n = input.nextInt();
		int a=0, b=0;
		String c ="";
		String d ="";
		String e ="";
		String f ="";
		
		for (int i = 0; i < n; i++) {
			a = a + 3;
			c = c + (a-1) + " ";
			b = b + 4;
			d = d + (b/2) + " ";
			e = e +((a-1)+(b/2)) + ",";
		}
		String[] arrayE = e.split(",");
		
		for (int i = arrayE.length-1; i >= 0; i--) {
			f= f+arrayE[i]+",";
		}
		System.out.println(e);
		System.out.println(f);
	}

}