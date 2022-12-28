package day9.pagi;

public class ProgramUtama2 {
	public static void main(String[] args) {

		Vehicle abc = new Vehicle("sedan");
		
		
		abc.belokKiri();
		abc.belokKanan();
		
		
		Car car = new Car("Kijang", "Muter");
		
		car.belokKanan();
		car.belokKiri();
		car.bukaJendela();
	}
}
