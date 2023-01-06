package FinalTest1;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("m = ");
		int m = input.nextInt();//5,3
		System.out.print("n = ");
		int n = input.nextInt();//2,2
		
		int persegi = m*m;
		int kubus = 6*n*n;
		
		int jumlahPersegi = kubus/persegi;
		System.out.println("jumlah Persegi : " + jumlahPersegi);
		
		
	}

}
