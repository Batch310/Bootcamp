package simulasi.ft1;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//alfabet A=0, B=1, C=2 ,....Z=25
		// input string ABCABC, input array 0,1,2,1,2,3
		//output = true, true ,true false,false,false
		
		Scanner scan = new Scanner(System.in);
		System.out.println("input string: ");
		String inputStr = scan.nextLine();
		System.out.println("input array: ");
		int inputArr = scan.nextInt();
		
		String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] arrAlfabet = alfabet.split("");
		
		
	}

}
