package day2.pagi;

public class MateriArray1Dim {

	public static void main(String[] args) {
		//Deklarasi Array
		
		//Deklarasi tanpa instansiasi
		int[] arrayA;
		
		//Deklarasi + instansiasi
		//Panjang arraynya 5
		//Indeksnya 0,1,2,3,4

		String[] arrayB = new String[5]; //fix 5

		//Deklarasi + nilai awal
		int[] arrayC = new int[] {1,2,3,4,5};
		
		//MENGAMBIL DATA DARI ARRAY
		
		System.out.println(arrayC[3]);
		System.out.println(arrayC[4]);
		
		// MENGUBAH/Mengisi DATA DARI ARRAY
		System.out.println(arrayB[0]);
		
		arrayB[0] = "Tyann";
		System.out.println(arrayB[0]);
		
	}

}
