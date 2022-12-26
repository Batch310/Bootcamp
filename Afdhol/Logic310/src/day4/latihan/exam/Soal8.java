package day4.latihan.exam;

import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {

		int jml_deret, n1 = 0, n2 = 1, n3;
		
		
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret = ");
        jml_deret = in.nextInt();
        System.out.print(n2+" ");
        
        
        for (int i = 1; i <= jml_deret; i++) {
            n3 = n1 + n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
	}

}
