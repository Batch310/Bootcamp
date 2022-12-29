package day9.pagi;

public class ProgramUtama2 {
	public static void main(String[] args) {

		Vehicle vehiclee = new Vehicle("Honda Brio");

		vehiclee.belokKiri();
		vehiclee.belokKanan();

		Car cer = new Car("Honda Jazz", "Putar");
		cer.belokKiri();
		cer.belokKanan();
		cer.bukaJendela();
	}
}
