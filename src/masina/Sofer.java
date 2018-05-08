
package masina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sofer extends Persoana{
	private int numarPermis;
	private String tipPermis;
	private int dataExpirarePermis;
	private Masina masina;
	private boolean conditiiOprire = true;
	
	public void seteazaDestinatie() {
		System.out.println("Introdu adresa de destinatie: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String adresa = null;
		try {
			adresa = new String(in.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//se calculeaza rute
		
		System.out.println("Alegeti ruta:");
		System.out.println("1) Lorem ipsos dolor sit amet");
		System.out.println("2) Consectetur etcaetera si asa mai departe");
		
		String optiune = null;
		try {
			optiune = new String(in.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		masina.setTraseu(new Ruta(adresa));
	}
	
	public void preiaControlul() {
		//TODO
	}
	
	public void aprindeFaruri() {
		System.out.println("Faruri aprinse");
	}
	
	public void pornesteStergatoare() {
		System.out.println("Stergatoare pornite");
	}
	
	public void stationare() {
		if(masina.validare(StareMasina.stationata)) {
			masina.setStareCurenta(StareMasina.stationata);
			System.out.println("Masina a fost stationata");
			
		}
		else
		{
			System.out.println("Masina nu a putut fi stationata");
		}
		
	}
	
	public void schimbareConditii(int ok) {
		if(ok == 0)
			conditiiOprire = false;
		else if(ok == 1)
			conditiiOprire = true;
	}
	
	public void oprireUrgenta() {
		if(masina.validare(StareMasina.opritaDeUrgenta) && conditiiOprire == true) {
			masina.setStareCurenta(StareMasina.opritaDeUrgenta);
			System.out.println("Masina a fost oprita de urgenta");
		}
		else {
			System.out.println("Masina nu se poate opri de urgenta");
		}
	}
	
	public void pleaca(){
		if(masina.getTraseu() != null) {
			if(masina.getProcentRezervor() > 10 && masina.getService().compareTo("functionala") == 0) {
				if(masina.validare(StareMasina.inDeplasare)) {
					masina.setStareCurenta(StareMasina.inDeplasare);
					System.out.println("Masina a plecat la destinatie");
				}
				else System.out.println("Masina nu poate pleca.");
			}
			else System.out.println("Masina nu poate pleca.");
		}
		else seteazaDestinatie();
	}
	
	
	public Sofer(String nume, int numarPermis, String tipPermis, int dataExpirarePermis, Masina m) {
		super(nume);
		this.numarPermis = numarPermis;
		this.tipPermis = tipPermis;
		this.dataExpirarePermis = dataExpirarePermis;
		this.masina = m;
	}
	
	public int getNumarPermis() {
		return numarPermis;
	}
	
	public void setNumarPermis(int numarPermis) {
		this.numarPermis = numarPermis;
	}
	
	public String getTipPermis() {
		return tipPermis;
	}
	
	public void setTipPermis(String tipPermis) {
		this.tipPermis = tipPermis;
	}
	
	public int getDataExpirarePermis() {
		return dataExpirarePermis;
	}
	
	public void setDataExpirarePermis(int dataExpirarePermis) {
		this.dataExpirarePermis = dataExpirarePermis;
	}
	
}