package day2.latihan2;

import java.util.Scanner;

public class Soal1cara2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
				System.out.print("Masukkan n  : ");
				int n = input.nextInt();
				System.out.print("Masukkan n2 : ");
				int n2 = input.nextInt();
				int a = 0,b=1;
				for(int i = 0; i<2; i++) {
					for(int j = 0; j<n; j++){
						if(i==0) {
							System.out.print(a + "\t");
							a++;
						}
						else {
							System.out.print(b + "\t");
							b*=3;
						}
					}System.out.println();	
					
				}
	}

}
