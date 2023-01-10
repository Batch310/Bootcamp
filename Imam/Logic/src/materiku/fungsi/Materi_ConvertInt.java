package materiku.fungsi;

public class Materi_ConvertInt {

	public static void main(String[] args) {

		String kata = "7";

		// Bagian convert
		int kataInt = Integer.parseInt(kata);
		System.out.println(kataInt);

		int jumlah = kataInt * kataInt;

		System.out.println();
		System.out.println(jumlah);

	}

}
