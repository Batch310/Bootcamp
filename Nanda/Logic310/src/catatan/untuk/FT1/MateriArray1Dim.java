package catatan.untuk.FT1;

public class MateriArray1Dim {

	public static void main(String[] args) {
		//DEklarasi Array
		
		//deklarasi tanpa instansiasi
		
		int[] arrayA;
		
		//deklarasi + instansiasi
		//panjang array = 5
		String[] arrayB = new String[5];
		//indeksnya 01234
		
		//deklarasi+nilai awal
		int[] arrayC = new int[] {1,2,3,4,5};
		
		
		
		//MEngambil Data Dari Array
		
		System.out.println(arrayC[3]);
		System.out.println(arrayC[4]);
		
		System.out.println(arrayC[7]);
		//MENGUBAH/MENGISI DATA DARI ARRAY
		System.out.println(arrayB[0]);  //sebelum diubah
		
		arrayB[0] = "Nanda";
		
		System.out.println(arrayB[0]);
	}
}
