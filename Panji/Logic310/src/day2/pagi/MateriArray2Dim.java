package day2.pagi;

public class MateriArray2Dim {

	public static void main(String[] args) {

		// DEKLARASI ARRAY
		int[][] arrA;

		String[][] arrB = new String[2][5]; // Barisnya 2 kolomnya 5

		int[][] arrC = new int[][] { { 1, 2, 3 }, // Baris 1
				{ 4, 5, 6 }, // Baris 2
				{ 7, 8, 9 } // Baris 3
		};

		// MENGAMBIL DATA ARRAY
		System.out.println(arrC[1][0]);

		// MENGISI/MENGUBAH DATA ARRAY
		System.out.println(arrC[2][1]);

		arrC[2][1] = 11;

		System.out.println(arrC[2][1]);

	}

}
