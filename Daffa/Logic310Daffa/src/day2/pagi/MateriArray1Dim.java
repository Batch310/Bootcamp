package day2.pagi;

public class MateriArray1Dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DEKLARASI ARRAY 1 DIMENSI

		// Deklarasi tanpa instansiasi
		int[] arrayA;

		// Deklarasi dengan instansiasi
		String[] arrayB = new String[5]; // panjang array 5 (tidak bisa ditambah atau dikurangi)
		// Indeks dari 0 (0,1,2,3,4)

		// Deklarasi dengan nilai awal
		int[] arrayC = new int[] { 1, 2, 3, 4, 5 };

		// MENGAMBIL DATA DARI ARRAY

		// Mengambil data dari index ke-sekian
		System.out.println(arrayC[4]);
		System.out.println(arrayC[3]);

		// MENGUBAH DATA & MENGISI DARI ARRAY

		System.out.println(arrayB[0]);
		arrayB[0] = "Jambrong";
		System.out.println(arrayB[0]);
	}
}