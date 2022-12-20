package day3.Warmupp;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {

		int n = 6;

		Scanner input = new Scanner(System.in);
		
		int jumlah=0;
		int a = 1;
		for (int i = 0; i < n; i++) {
			//System.out.print(a + " ");
			a += 1;
			int array[] = {a}; 
			jumlah += array[];
			System.out.println(jumlah);
		}

	}

}
