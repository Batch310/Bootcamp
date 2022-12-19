package day2.pagi;

public class MateriArray1Dim {

	public static void main(String[] args) {
		// DEKLARASI ARRAY

		//ARRAY 1 DIMENSI
		int[] arrA; // DEKLARASI TANPA INSTANSIASI

		String[] arrB = new String[5]; // DEKLARASI DENGAN INSTANSIASI (panjang array 5)

		int[] arrC = new int[] { 1, 2, 3, 4, 5 }; // DEKLARASI + NILAI AWAL

		// MENGAMBIL DATA DARI ARRAY C
		System.out.println(arrC[3]);
		System.out.println(arrC[0]);

		arrC[0] = 9;

		System.out.println(arrC[0]);

		// MENGUBAH/ MENGISI DATA DARI ARRAY B
		System.out.println(arrB[0]);
		System.out.println(arrB[1]);

		arrB[1] = "Senin";
		arrB[0] = "Panji";

		System.out.println(arrB[0]);
		System.out.println(arrB[1]);
	}

}
