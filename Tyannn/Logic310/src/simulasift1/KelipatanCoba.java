package simulasift1;

public class KelipatanCoba {

	public static void main(String[] args) {

		int x = 5;

		int[] arr = new int[x];

		int nilaiAwal = 2;
		for (int i = 0; i < arr.length; nilaiAwal += 2) {
			if (nilaiAwal%2 == 0) {
				arr[i] = nilaiAwal;
				i++;
			}
		}

		for (int i : arr) {
			System.out.println(i+" ");
		}

		System.out.println();
		

	}

}
