package day2.pagi;

public class MateriArray1Dim {
	public static void main(String[] args) {
		//DEKLARASI ARRAY
		
		//deklarasi tanpa instansiasi
		int[] arrayA;
		
		//deklarasi + instansiasi
		//panjang arraynya 5
		//Indeksnya 0,1,2,3,4
		String[] arrayB = new String[5]; //fix 5
		
		//deklarasi + nilai awal
		int[] arrayC = new int[]{1,2,3,4,5};
		
		//MENGAMBIL DATA DARI ARRAY
		
		//Mengambil data dari arrayC index ke 2
		//arrayC[2];
		
		System.out.println(arrayC[3]);
		System.out.println(arrayC[4]);
		
		//System.out.println(arrayC[7]);
		
		
		//MENGUBAH/MENGISI DATA DARI ARRAY
		System.out.println(arrayB[0]);
		
		arrayB[0] = "Yudha";
		
		System.out.println(arrayB[0]);
	}
}
