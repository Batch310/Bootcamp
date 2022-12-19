package day2.pagi;

public class MateriArray2Dim {

	public static void main(String[] args) {
		
		//Deklarasi array
		
		int[][] arrayA;
		
		String [][] arrayB = new String[2][5];
		
		int [][] arrayC= new int[][] {
			
			{1,2,3}, //baris 1
			{4,5,6}, //baris 2
			{7,8,9}   //baris 3
			
			
		};
		
		//Mengambil data array
		System.out.println(arrayC[2][1]);
		
		//Mengisi/mengubah array
		System.out.println(arrayC[0][0]);
		arrayC[0][0] = 11;
		System.out.println(arrayC[0][0]);
		
		

	}

}
