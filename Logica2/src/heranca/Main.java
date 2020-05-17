package heranca;

public class Main {

	public static void main (String[]args) {
	
		DuasRodas bicicleta1 = new DuasRodas();
		bicicleta1.movimentar();
		
		MountainBike bike = new MountainBike();
		bike.setNSerie(4);
		System.out.println(bike.getNSerie());
		bike.setNSerie(7);
		System.out.println(bike.getNSerie());
		
		bike.setMarca("Caloi");
		System.out.println(bike.getMarca());
		
		RacingBike bike2 = new RacingBike();
		bike2.getNSerie();
		System.out.println(bike2.getNSerie());
		bike2.setNSerie(9);
		System.out.println(bike.getNSerie());
		
		bike2.setMarca("hiundai");
		System.out.println(bike2.getMarca());
	}
}
