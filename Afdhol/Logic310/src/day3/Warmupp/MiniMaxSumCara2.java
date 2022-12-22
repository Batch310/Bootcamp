package day3.Warmupp;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MiniMaxSumCara2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		Scanner scan = new Scanner(System.in);

		int n = 5;


		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {

			System.out.println("Masukkan angka: ");
			array[i] = scan.nextInt();
			

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		//Cara 2
		
		//Cara sorting 
		Arrays.sort(array);
		
		int min = array[0]+array[1]+array[2]+array[3];
		int max = array[0]+array[1]+array[2]+array[3];
		
		System.out.println();
		System.out.println(min);
		System.out.println(max);

		
	}
	

}
