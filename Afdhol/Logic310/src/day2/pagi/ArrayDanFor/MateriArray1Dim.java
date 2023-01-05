package day2.pagi.ArrayDanFor;

public class MateriArray1Dim {

	public static void main(String[] args) {

	//DEKLARASI ARRAY
		
	//deklarasi tanpa instansiasi	
	int[] arrayA;
	
	
	//deklarasi dengan instansiasi
	//panjang arraynya 5
	String[] arrayB = new String[5]; //indeksnya 0,1,2,3,4
	
	
	//deklarasi + nilai awal	
	int[] arrayC = new int[] {1,2,3,4,5};
	
	
	//MENGAMBIL DATA ARRAY
	
	System.out.println(arrayC[3]); //mengambil indeks ke 3
	System.out.println(arrayC[4]); //mengambil indeks ke 4
  	
	
	//MENGUBAH dan MENGISI DATA DARI ARRAY
	
	//sebelum diisi
	System.out.println(arrayB[0]);
	
	//mengisi
	arrayB[0] = "Yudha";
	
	System.out.println(arrayB[0]);
	
	
	System.out.println(arrayB[1]);
	}

}
