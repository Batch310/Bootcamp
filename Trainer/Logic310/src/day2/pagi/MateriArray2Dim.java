package day2.pagi;

public class MateriArray2Dim {
	public static void main(String[] args) {
		//DEKLARASI ARRAY
		int[][] arrayA;
		
		//barisnya 2, kolomnya 5
		String[][] arrayB = new String[2][5];
		
		int[][] arrayC = new int[][] {
			{1,2,3}, //baris 1
			{4,5,6}, //baris 2
			{7,8,9}  //baris 3
		};
		
		
		//MENGAMBIL DATA ARRAY
		System.out.println(arrayC[2][1]);
		System.out.println(arrayC[1][2]);
		
		
		//MENGISI/MENGUBAH ARRAY
		System.out.println(arrayC[0][0]);
		
		arrayC[0][0] = 11;
		
		System.out.println(arrayC[0][0]);
	}
}
