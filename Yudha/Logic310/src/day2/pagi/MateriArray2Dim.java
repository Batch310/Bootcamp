package day2.pagi;

public class MateriArray2Dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Deklarasi Array
		int [][] arrayA;
		
		// barisnya 2 dan kolomnya 5
		String [][] arrayB = new String[2][5];
		
		int [][] arrayC = new int[][] {
			{1,2,3}, // baris1
			{4,5,6,10}, // baris2
			{7,8,9} // baris3
		};
		// Mengambil data array
		System.out.println(arrayB[1][2]);
		System.out.println(arrayC[1][3]);
		System.out.println(arrayC[2][2]);
		
		// Mengisis / mengubah Array
		System.out.println(arrayC[0][0]);
		arrayC[0][0] = 26;
		System.out.println(arrayC[0][0]);
	}

}
