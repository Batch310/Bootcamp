package day2.pagi;

public class MateriArray2Dimensi {

	public static void main(String[] args) {
		// DEKLARASI ARRAY 2 DIMENSI
		//Deklarasi Tanpa Instansiasi 
		int[][] arrayA; 
		
		//Deklarasi + Instansiasi dengan jumlah baris 2 dan jumlah kolom 5
		String[][] arrayB = new String[2][5]; 
		
		//Deklarasi + Instansiasi Nilai Awal
		int[][] arrayC = new int[][] { //Kolom mengikuti indeks yang terbanyak
			{1,2,3,}, //Baris 1
			{4,5,6,}, //Baris 2
			{7,8,9} //Baris 3
		};
		
		//MENGAMBIL DATA DARI ARRAY
		System.out.println(arrayC[0][2]); //Mencetak data dari arrayC baris ke-1 (i=0) kolom ke-3 (j=2)
		
		//MENGISI/MENGUBAH DATA ARRAY
		System.out.println(arrayC[0][0]); //Mencetak data dari arrayC baris ke-1 (i=0) kolom ke-1 (j=0) sebelum diubah
		arrayC[0][0] = 11;
		System.out.println(arrayC[0][0]); //Mencetak data dari arrayC baris ke-1 (i=0) kolom ke-1 (j=0) setelah diubah
		
	}

}
