package coba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan panjang array: ");
		Integer n = masukan.nextInt();
		
		List<Long> ar = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Masukkan angka:");
			ar.add(masukan.nextLong());
		}
		
		masukan.close();
		
        Long veryBigSum = 0l;
        
        for (int i = 0; i < ar.size(); i++) {
            veryBigSum += ar.get(i);
        }
        
        System.out.println(veryBigSum);
		
	}
}
