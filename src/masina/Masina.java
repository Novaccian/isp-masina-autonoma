package masina;

import java.util.ArrayList;

public class Masina {
	private String model;
	private int nrUsi;
	private String numar;
	private TipCombustibil tip;
	private StareMasina stareCurenta;
	private String service;
	private int procentRezervor;
	private Ruta traseu;
	private ArrayList<Persoana> pasageri;

	public Masina(String model, int nrUsi, String numar, TipCombustibil tip, StareMasina stareCurenta) {
		this.model = model;
		this.nrUsi = nrUsi;
		this.numar = numar;
		this.tip = tip;
		this.stareCurenta = stareCurenta;
		this.traseu = null;
		this.service = new String("functionala");
		this.procentRezervor = 100;
	}
	
	public Masina() {
		this("", 4, "12345", TipCombustibil.benzina, StareMasina.oprita);
	}
	
	public void adaugaPasager(Persoana p) {
		if(pasageri.size() <= 5) {
			pasageri.add(p);
		}
		else {
			System.out.println("Pare rau, nu mai este loc in masina");
		}
	}
	
	public void pornesteMotor() {
		if(validare(StareMasina.pornita)) {
			setStareCurenta(StareMasina.pornita);
			System.out.println("Masina a fost pornita");
		}
		else {
			System.out.println("Masina nu poate fi pornita");
		}
	}
	
	public void opresteMotor() {
		if(validare(StareMasina.oprita)) {
			setStareCurenta(StareMasina.oprita);
			System.out.println("Masina a fost oprita");
		}
		else {
			System.out.println("Masina nu poate fi oprita");
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNrUsi() {
		return nrUsi;
	}

	public void setNrUsi(int nrUsi) {
		this.nrUsi = nrUsi;
	}

	public String getNumar() {
		return numar;
	}

	public void setNumar(String numar) {
		this.numar = numar;
	}

	public TipCombustibil getTip() {
		return tip;
	}

	public void setTip(TipCombustibil tip) {
		this.tip = tip;
	}

	public StareMasina getStareCurenta() {
		return stareCurenta;
	}

	public void setStareCurenta(StareMasina stareCurenta) {
		this.stareCurenta = stareCurenta;
	}
	
	public Ruta getTraseu() {
		return traseu;
	}

	public void setTraseu(Ruta traseu) {
		this.traseu = traseu;
	}
	
	
	
	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public int getProcentRezervor() {
		return procentRezervor;
	}

	public void setProcentRezervor(int procentRezervor) {
		this.procentRezervor = procentRezervor;
	}

	public boolean validare(StareMasina stareUrmatoare) {
		switch(stareCurenta) {
		case oprita:
			if(stareUrmatoare == StareMasina.pornita)
				return true;
			else
				return false;
		case pornita:
			if(stareUrmatoare == StareMasina.gataDePlecare)
				return true;
			else
				return false;
		case gataDePlecare:
			if(stareUrmatoare == StareMasina.inDeplasare)
				return true;
			else
				return false;
		case inDeplasare:
			if(stareUrmatoare == StareMasina.ajunsaLaDestinatie ||
			   stareUrmatoare == StareMasina.stationata)
				return true;
			else
				return false;
		case ajunsaLaDestinatie:
			if(stareUrmatoare == StareMasina.pornita)
				return true;
			else
				return false;
		case opritaDeUrgenta:
			if(stareUrmatoare == StareMasina.pornita)
				return true;
			else
				return false;
		case stationata:
			if(stareUrmatoare == StareMasina.inDeplasare)
				return true;
			else
				return false;
		default:
				return false;
		}
	}
}