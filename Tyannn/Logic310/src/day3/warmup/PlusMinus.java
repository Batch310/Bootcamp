package day3.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("n = ");
		int n = input.nextInt();
		
		double pos=0, neg=0, nol=0;
		int[] arrA = new int[n];
		
		
		for(int i=0; i<arrA.length; i++) {
			arrA[i] = input.nextInt();

			
			if(arrA[i]>0) {
				pos++;
			}else if(arrA[i]<0) {
				neg++;
			}else {
				nol++;
			}
			}
		
		for(int i=0;i<arrA.length;i++) {
			System.out.println(arrA[i]);
		}
		
			System.out.println();
			
			System.out.print("Bilangan positif/jumlah = " + pos/arrA.length);
			System.out.println();
			System.out.print("Bilangan negatig/jumlah = " + neg/arrA.length);
			System.out.println();
			System.out.print("Bilangan kosong/jumlah = " + nol/arrA.length);
		}

//		System.out.println(pos/arrA.length);
//		System.out.println(neg/arrA.length);
//		System.out.println(nol/arrA.length);
	

}
