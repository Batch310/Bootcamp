package day9.pagi;

public class ProgramUtama2 {
	
	public static void main(String[] args) {
		
		
		Vehicle abc = new Vehicle("Sedan");
		
		abc.belokKiri();
		abc.belokKanan();
		
		Car cir = new Car("HRV", "Bulet");
		cir.belokKiri();
		cir.belokKanan();
		cir.bukaJendela();
	}
	
	

}
