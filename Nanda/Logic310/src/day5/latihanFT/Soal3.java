package day5.latihanFT;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input : ");
		int n = input.nextInt();
		
		int awal = 0;
		
		for (int i = 100; awal < n ; i++) {
			String a = Integer.toString(i);
			String[] arrA = a.split("");
			
			int tampung = 0;
			for (int j = 0; j < arrA.length; j++) {
				int c = Integer.parseInt(arrA[j]);
				int hasil = (int) Math.pow(c, 2);
				tampung += hasil;
			}
				if (tampung == 1) {
					System.out.println(i+ " adalah Si angka 1");
					awal++;
				}else {
					while (tampung > 9) {
						String d = Integer.toString(tampung);
						String[] aarB = d.split("");
						tampung = 0;
						for (int k = 0; k < aarB.length; k++) {
							int e = Integer.parseInt(aarB[k]);
							int hasil2 = (int) Math.pow(e, 2);
							tampung += hasil2;
						}
						if (tampung == 1) {
							System.out.print(i+ " adalah Si angka 1");
							awal++;
						}
					}
				}
			}
		
		}
	}