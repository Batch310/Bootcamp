package day2.pagi;

public class MateriArray1Dimensi {

	public static void main(String[] args) {
		//DEKLARASI ARRAY
		
		//Array 1 Dimensi
		//Deklarasi Tanpa Instansiasi
		int[] arrayA;
		//Deklarasi + Instansiasi dengan panjang array 5 (Indeksnya 0,1,2,3,4)
		String[] arrayB = new String[5]; //Panjang array fix 5, tidak bisa diubah. Kalau mau menambah data baru, menggunakan fungsi List
		
		//Deklarasi + Instansiasi dengan nilai awal
		int[] arrayC = new int[] {1,2,3,4,5};
		
		//MENGAMBIL DATA DARI ARRAY
		System.out.println(arrayC[3]); //Mengambil data dari arrayC indeks ke-3
		System.out.println(arrayC[4]); //Mengambil data dari arrayC indeks ke-4
		System.out.println(arrayB[0]); //Mengambil data dari arrayB indeks ke-0 sebelum diubah
		
		//MENGUBAH DATA ARRAY
		arrayB[0] = "Haidar"; //Mengubah data dari arrayB indeks ke-0
		System.out.println(arrayB[0]); //Mengambil data dari arrayB indeks ke-0 setelah diubah
		
	}

}
