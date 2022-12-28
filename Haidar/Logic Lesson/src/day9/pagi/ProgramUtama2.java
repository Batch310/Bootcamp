package day9.pagi;

public class ProgramUtama2 {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("sedan");
		
		vehicle.belokKiri();
		vehicle.belokKanan();
		
		Car cer = new Car("Kijang", "Bulet");
		cer.belokKanan();
		cer.belokKiri();
		cer.bukaJendela();
	}
}
