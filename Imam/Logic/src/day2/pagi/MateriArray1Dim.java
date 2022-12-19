package day2.pagi;

public class MateriArray1Dim {

	public static void main(String[] args) {
		
		// Deklarasi Array
		//deklarasi tanpa instansiasi
		int[] arrayA;

		
		//deklarasi + instansiasi(panjang index array)
		//panjang arraynya 5
		//indexnya 0,1,2,3,4
		
		String[] arrayB = new String[5]; //fix 5
		
		
		//deklarasi + nilai awal
		int[] arrayC = new int[] {1,2,3,4,5};
		
		
		//Mengambil data dari array
		//Mengambil data dari arrayC index ke 2
		// contoh = arrayC[2];
		
		System.out.println(arrayC[3]);
		
		//Mengubah atau mrngisi data dari array
		
		System.out.println(arrayB[0]);  //sebelum diubah
		
		arrayB[0] = "Imam";       
		System.out.println(arrayB[0]);   //sesudah diubah
		
	
		
		
		
		
		
		
		
		
		
	}
	
}
