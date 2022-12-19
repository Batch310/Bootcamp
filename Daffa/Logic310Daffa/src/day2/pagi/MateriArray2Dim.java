package day2.pagi;

public class MateriArray2Dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DEKLARASI ARRAY 2 DIMENSI
		int[][] arrayA;

		String[][] arrayB = new String[2][5]; // panjang baris 5, panjang kolom 5

		int[][] arrayC = new int[][] {
				{ 1, 2, 3 }, // baris 1
				{ 4, 5, 6, 10}, // baris 2
				{ 7, 8, 9 }, // baris 3
		};
		
		// MENGAMBIL DATA ARRAY
		System.out.println(arrayC[2][1]);
		System.out.println(arrayC[1][2]);
		
		// MENGISI & MENGUBAH DATA ARRAY
		System.out.println(arrayC[1][1]);
		arrayC[1][1] = 11;
		System.out.println(arrayC[1][1]);
	}
}