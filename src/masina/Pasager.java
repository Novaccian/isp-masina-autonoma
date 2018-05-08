package masina;

public class Pasager extends Persoana{
	private int loc;

	public Pasager(String nume, int loc) {
		super(nume);
		this.loc = loc;
	}

	public int getLoc() {
		return loc;
	}

	public void setLoc(int loc) {
		this.loc = loc;
	}
	
	public void deschideGeam() {
		System.out.println("Geamul de pe locul " + loc + " a fost deschis.");
	}
	
	public void incalzireScaun() {
		System.out.println("Incalzirea scaunului incepe pe locul " + loc);
	}
	


}
