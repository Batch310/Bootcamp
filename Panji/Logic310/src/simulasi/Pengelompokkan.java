package simulasi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Pengelompokkan {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input n : ");
		String n = scanner.nextLine().toLowerCase();
		
		String[] arrayN = n.split("");
		
		Arrays.sort(arrayN);
		
		String huruf = "abcdefghijklmnopqrstuvwxyz";
		String output = "";
		
		String hurufSebelumnya = "";
		for (int i = 0; i < arrayN.length; i++) {
			String hurufSekarang = arrayN[i];
			if(huruf.contains(hurufSekarang)) {
				if(!hurufSebelumnya.equals("") && !hurufSekarang.equals(hurufSebelumnya)) {
					output = output + " | ";
				} 
				output = output + hurufSekarang;
				hurufSebelumnya = hurufSekarang;
			}
		}
		
		System.out.println(output);
		
		
		
	}
}
