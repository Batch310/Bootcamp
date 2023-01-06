package materiku.fungsi;

public class MateriArray1Dim {

	public static void main(String[] args) {
		
		// Deklarasi Array
		//deklarasi tanpa instansiasi
		int[] arrayA;

		
		//deklarasi + instansiasi(panjang index array)
		//panjang arraynya 5
		//indexnya 0,1,2,3,4
		
		int[] arrayB = new int[6]; //fix 5
		
		
		int data = 10;
		for (int i = 0; i < arrayB.length; i++) {
		      arrayB[i]= data ;
		      data++;
		}
		for (int i : arrayB) {          //tampilkan array dengan foreach
		 System.out.print(i+ " ");   
		}
		
		System.out.println();
		
		
		for (int i = 0; i < arrayB.length; i++) {
		         arrayB[i]=data+1;
		         data++;
		}
		
		for (int i = 0; i < arrayB.length; i++) {
		System.out.print(arrayB[i]+ " ");
		}
		
		
		System.exit(0);
		
		
		
		
		//deklarasi + nilai awal
		int[] arrayC = new int[] {7,2,5,4,5};
		
		for (int i = 0; i < arrayC.length; i++) {
			System.out.print(arrayC[i] + " ");
		}
		
		
		
		
		//Mengambil data dari array
		//Mengambil data dari arrayC index ke 2
		// contoh = arrayC[2];
		
		System.out.println(arrayC[3]);
		
		//Mengubah atau mrngisi data dari array
		
		System.out.println(arrayB[0]);  //sebelum diubah
		
//		arrayB[0] = "Imam";       
		System.out.println(arrayB[0]);   //sesudah diubah
		
	
		
		
		
		
		
		
		
		
		
	}
	
}
