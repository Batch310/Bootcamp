package day6;

import java.util.Scanner;

public class CamelCase1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("masukkan kata : ");
		String kata = scanner.nextLine();
		
		System.out.println(kata.split("[A-Z]").length);
	}
}
