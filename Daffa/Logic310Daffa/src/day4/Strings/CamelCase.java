package day4.Strings;

import java.util.Iterator;
import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan kata : ");
		String kata = input.next();

		int jumlahKata = 0;
		for (int i = 0; i < kata.length(); i++) {
			if (Character.isUpperCase(kata.charAt(i))) {
				jumlahKata++;
			}
		}
		System.out.println(jumlahKata + 1);
	}

}
