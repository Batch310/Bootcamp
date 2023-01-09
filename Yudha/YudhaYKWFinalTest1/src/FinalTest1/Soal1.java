package FinalTest1;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		int esLoli = 700;
		int stempel=0;
		int jumlah = 0;
		while(n>=700) {
			n=n-700;
			stempel++;
			jumlah++;
			if(stempel%5==0) {
				jumlah++;
				stempel=1;
			}
		}
		System.out.println("Bambang mendapatkan "+ jumlah + " Es Loli");
		System.out.println(n);
		

	}

}
