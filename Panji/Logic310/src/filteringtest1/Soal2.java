package filteringtest1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print(" input n : ");
		String  n = input.nextLine().toLowerCase();
		
		String[] arr1 = n.split("");
		
		Arrays.sort(arr1);
		
		String huruf ="abcdefghijklmnopqrstuvwxyz";
		String output = ""; //variabel bantu tampung
		
		String hurufSebelum =""; //variabel bantu tampung
		
		for (int i = 0; i < arr1.length; i++) {
			String hurufBaru = arr1[i]; //simpan arr[i] ke string hurufBaru
			if(huruf.contains(hurufBaru)) { // kondisi tes apakah var hurufBaru mengandung data di var huruf
				if(!hurufSebelum.equals("") && !hurufBaru.equals(hurufSebelum)) {
					output += "-";
				}
				output = output + hurufBaru;
				hurufSebelum = hurufBaru;
			}
		}
		System.out.println(output);
	}

}
