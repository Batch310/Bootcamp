package coba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {
	public static void main(String[] args) {
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan jumlah siswa: ");
		Integer n = masukan.nextInt();
		
		List<Integer> grades = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Masukkan nilai setiap siswa: ");
			grades.add(masukan.nextInt());
		}
		
		masukan.close();
		
		for (int i = 0; i < grades.size(); i++) {
			if ((grades.get(i) + 2) < 40) {
				grades.set(i, grades.get(i));
			} else if ((grades.get(i) + 1) % 5 == 0) {
				grades.set(i, (grades.get(i) + 1));
			} else if ((grades.get(i) + 2) % 5 == 0) {
				grades.set(i, (grades.get(i) + 2));
			}
			
			System.out.println(grades.get(i));
		}
		
	}
}
