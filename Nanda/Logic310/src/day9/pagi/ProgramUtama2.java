package day9.pagi;

public class ProgramUtama2 {

	public static void main(String[] args) {
		Vehicle abc = new Vehicle("sedan");
		
		abc.belokKiri();
		abc.belokKanan();
		
		Car cer = new Car("Kijang", "Bulet");
		cer.belokKanan();
		cer.belokKiri();
		cer.bukaJendela();

	}

}
