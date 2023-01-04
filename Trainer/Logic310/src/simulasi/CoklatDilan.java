package simulasi;

import java.util.Scanner;

public class CoklatDilan {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input n : ");
		int n = scanner.nextInt();
		
		int bonus = (n/5)/1000;
		int total = (n/1000) + bonus;
		
		System.out.println("Nanda mendapatkan " + total + " coklat dilan");
	}
}
