package day9.pagi;

public class ProgramUtama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle abc = new Vehicle("sedan");
		
		abc.belokKiri();
		abc.belokKanan();
		
		Car mobil = new Car("Toyota", "Bulat");
		mobil.belokKiri();
		mobil.belokKanan();
		mobil.bukaJendela();
	}

}
