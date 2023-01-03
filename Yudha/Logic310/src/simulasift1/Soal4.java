package simulasift1;

import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		int coklat = 1000;
		int stempel=0;
		int jumlah = 0;
		while(n>=1000) {
			n=n-1000;
			stempel++;
			jumlah++;
			if(stempel%5==0) {
				jumlah++;
			}
		}
		System.out.println("Nanda mendapatkan "+ jumlah + " coklat dilan");
		
	}

}
