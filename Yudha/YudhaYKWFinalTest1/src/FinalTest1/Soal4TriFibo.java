package FinalTest1;

import java.util.Scanner;

public class Soal4TriFibo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan x : ");
		int x = input.nextInt();
		int found=0;
		int y = 0;
		String deret = "";
		for (int i = 0; found < x; i++) {
			y = y + 3;
			if(y%4!=0) {
				deret = deret+y+" ";
				found++;
			}
		}
		System.out.println(deret);
		
	}

}
