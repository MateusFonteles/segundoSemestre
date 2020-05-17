package heranca;

public class Bicicleta extends DuasRodas{
	protected int nSerie;
	String marca;
	String cor;
	int ano;
	
	public int getNSerie() {
		return nSerie;
	}
	
	public void setNSerie(int nSerie) {
		this.nSerie = nSerie;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca () {
		return marca;
		
	}
}
