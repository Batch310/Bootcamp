package day3.latihan2;

import java.util.Scanner;

public class Soal5HackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan jumlah input");
		int q = input.nextInt();
		System.out.println();
		String [] arrayHR = new String[q];
		String [] hRank = "hackerrank".split("");
		boolean a=true;
		for (int i = 0; i < q; i++) {
			arrayHR[i] = input.next();
		}
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < hRank.length; j++) {
				if(arrayHR[i].contains(hRank[j])) {
					a = true;
					continue;
				}
				else {
					a = false;
					break;
				}	
			}
			if(a==true) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}
