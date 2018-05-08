package masina;

public class Ruta {
	private String destinatie;
	int kilometri;
	
	public Ruta(String destinatie, int kilometri) {
		this.destinatie = destinatie;
		this.kilometri = kilometri;
	}
	
	public Ruta() {
		this("", 0);
	}
	
	public int calculeazaDist() {
		//TODO
		return 0;
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

	public void setKilometri(int kilometri) {
		this.kilometri = kilometri;
	}
}
