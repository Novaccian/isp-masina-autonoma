package masina;

public class Ruta {
	private String destinatie;
	private int kilometri;
	
	public Ruta(String destinatie) {
		this.destinatie = destinatie;
		this.kilometri = this.calculeazaDist();
	}
	
	public int calculeazaDist() {
		//TODO
		return 90;
	}

	public String getDestinatie() {
		return destinatie;
	}

	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}

	public int getKilometri() {
		return kilometri;
	}
	
}
