package masina;

public abstract class Persoana {
	private String nume;
	
	public Persoana(String nume) {
		super();
		this.nume = nume;
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void puneCentura() {
		System.out.println("Centura a fost pusa");
	}
	
}
