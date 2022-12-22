package day5.test;

public class Soal5 {

	public static void main(String[] args) {
		// Jumlah orang dewasa laki-laki
		int orangDewasaLakiLaki = 3;
		// Jumlah orang dewasa perempuan
		int orangDewasaPerempuan = 1;
		// Jumlah orang remaja
		int orangRemaja = 0;
		// Jumlah orang anak
		int orangAnak = 0;
		// Jumlah orang balita
		int orangBalita = 1;

		// Hitung total porsi nasi goreng yang dimakan oleh orang dewasa laki-laki
		int totalNasiGorengDewasaLakiLaki = orangDewasaLakiLaki * 2;
		// Hitung total porsi mie goreng yang dimakan oleh orang dewasa perempuan
		int totalMieGorengDewasaPerempuan = orangDewasaPerempuan * 1;
		// Hitung total porsi ayam yang dimakan oleh orang remaja
		int totalAyamRemaja = orangRemaja * 2;
		// Hitung total porsi nasi goreng yang dimakan oleh orang anak
		int totalNasiGorengAnak = (int) (orangAnak * 0.5);
		// Hitung total porsi bubur sehat yang dimakan oleh orang balita
		int totalBuburSehatBalita = orangBalita * 1;

		// Hitung total porsi makanan yang dimakan
		int totalPorsiMakanan = totalNasiGorengDewasaLakiLaki + totalMieGorengDewasaPerempuan + totalAyamRemaja
				+ totalNasiGorengAnak + totalBuburSehatBalita;

		// Jika jumlah orang yang sedang makan ganjil dan lebih dari 5 orang
		if ((totalPorsiMakanan % 2 == 1) && (totalPorsiMakanan > 5)) {
			// Tambahkan 1 porsi nasi goreng untuk orang dewasa perempuan
			totalPorsiMakanan = totalPorsiMakanan + 1;
		}

		// Tampilkan total porsi makanan yang dimakan
		System.out.println("Total porsi makanan yang dimakan: " + totalPorsiMakanan);
	}

}
