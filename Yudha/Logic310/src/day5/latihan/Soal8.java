package day5.latihan;

import java.util.Iterator;
import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input Panjang Deret : ");
		int bil=0,found = 0,a=0,b=1,count=0;
		int n = input.nextInt();
		String prima = "", fibonachi="", primaPlusFibo="";
		for (int i = 1; found < n; i++) {
			bil = 0;
			for (int j = 1; j <= i; j++) {
				if(i%j==0) {
					bil++;
				}
			}
			if(bil==2) {
				prima = prima + (i+" ");
				found++;
			}
		}
		found = 0;
		System.out.println(prima);
		for (int i = 1; found < n; i++) {
			count = a+b;
			fibonachi = fibonachi + (count+" ");
			a = b;
			b = count;
			found++;
		}
		System.out.println(fibonachi);
		String[] arrayPrima = prima.split(" ");
		String[] arrayFibo = fibonachi.split(" ");
		for (int i = 0; i < n; i++) {
			int jumlah = Integer.parseInt(arrayPrima[i])+Integer.parseInt(arrayFibo[i]);
			primaPlusFibo += jumlah+" ";
			
		}
		System.out.println(primaPlusFibo);
	}
// ganjil dijumlah genap dikurangi nilai harus absolut
}
