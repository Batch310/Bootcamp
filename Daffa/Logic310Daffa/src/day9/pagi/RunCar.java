package day9.pagi;

public class RunCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle abc = new Vehicle("Sedan");

		abc.belokKiri();
		abc.belokKanan();
		
		Car cer = new Car("Kijang", "Bulat");
		cer.belokKanan();
		cer.belokKiri();
		cer.bukaJendela();
	}

}
