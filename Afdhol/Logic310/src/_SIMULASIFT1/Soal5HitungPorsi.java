package _SIMULASIFT1;

import java.util.Scanner;

public class Soal5HitungPorsi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int porsiDewasaL = 2;
		int porsiDewasaP = 1;
		int porsiRemaja = 1;
		double porsiAnak = 0.5;
		int porsiBalita = 1;

		int dewasaL = 0;
		int dewasaP = 0;
		int remaja = 0;
		int anak = 0;
		int balita = 0;

		double totalPorsi = 0;
		int totalOrang = 0;
		int tambahPorsi = 0;

		System.out.println("input: ");
		String input = scan.nextLine();

//		String laki = "";
//		String perempuan = "";

		String[] newArray = input.split(";");
		for (int i = 0; i < newArray.length; i++) {


			if (newArray[i].contains("laki-laki dewasa=")) {

				String[] lakiDewasa = newArray[i].split("=");
				// System.out.println(lakiDewasa[1]);
				String[] jmlLakiDewasa = lakiDewasa[1].split(" ");
				String jumlahLakiDewsa = jmlLakiDewasa[0];

				int jml = Integer.parseInt(jumlahLakiDewsa);

				dewasaL += jml;

			}
			
			if (newArray[i].contains("perempuan dewasa=")) {
				
				String[] splitPerempuanD = newArray[i].split("=");
				
				String[] jml = splitPerempuanD[1].split(" ");
				String jmlPDewasa = jml[0];
				
				int jml_akhir = Integer.parseInt(jmlPDewasa);
				
				dewasaP += jml_akhir;
				
			}if (newArray[i].contains("remaja=")) {
				String[] splitRemaja = newArray[i].split("=");
				String jml[] = splitRemaja[1].split(" ");
				String jmlRemaja = jml[0];
				
				int jml_akhir_Remaja = Integer.parseInt(jmlRemaja);
				
				remaja += jml_akhir_Remaja;
				
			}if (newArray[i].contains("anak-anak=")) {
				String[] splitAnak = newArray[i].split("=");
				String jml[] = splitAnak[1].split(" ");
				String jmlAnak = jml[0];
				
				int jml_akhir_anak = Integer.parseInt(jmlAnak);
				
				anak += jml_akhir_anak;
			}if (newArray[i].contains("balita=")) {
				String[] splitBalita = newArray[i].split("=");
				String jml[] = splitBalita[1].split(" ");
				String jmlBalita = jml[0];
				
				int jml_akhir_balita = Integer.parseInt(jmlBalita);
				
				balita += jml_akhir_balita;
			}
			

		}


		totalOrang = dewasaL + dewasaP + remaja + anak + balita;
		
		System.out.println(totalOrang);

		if (totalOrang % 2 == 1 && totalOrang > 5) {
			tambahPorsi++;
		}

		totalPorsi = (dewasaL * porsiDewasaL) + (dewasaP * porsiDewasaP) + (remaja * porsiRemaja) + (anak * porsiAnak)
				+ (balita * porsiBalita) + tambahPorsi;

		System.out.println(totalPorsi);

	}

}
