package day2.pagi;

public class MateriArray1Dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Deklarasi Array
		
		// Deklarasi tanpa instansiasi
		int [] arrayA;
		
		// Deklarasi + instansiasi
		// panjang arraynya 5
		String [] arrayB = new String[5];
		System.out.println(arrayB);
		
		// Deklarasi array + nilai awal
		int[] arrayC = new int[] {1,2,3,4,5};
		System.out.println(arrayC);
		
		// Menghambil Data dari Array
		System.out.println(arrayC[3]);
		System.out.println(arrayC[4]);
		
		// Mengambil data darinarrayC index ke-2
		int a = arrayC[2];
		System.out.println(a);
		
		System.out.println(arrayC[1]);
		
		// Mengubah/mengisi Data dari Array
		System.out.println(arrayB[0]);
		arrayB[0] = "Yudha";
		System.out.println(arrayB[0]);
	}

}
