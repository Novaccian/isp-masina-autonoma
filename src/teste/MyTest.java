package masina;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTest {

	Sofer sofer;
	Masina masina;
	
	@Test
	void test() {
		masina = new Masina("Dacia", 4, "VN09LZP", TipCombustibil.benzina, StareMasina.oprita);
		sofer = new Sofer("Radu", 111111, "B", 111122, masina);
	
		assertEquals(StareMasina.oprita, masina.getStareCurenta());
		System.out.println("Stare curenta: oprita;");
		masina.setStareCurenta(StareMasina.pornita);
		
		assertEquals(StareMasina.pornita, masina.getStareCurenta());
		System.out.println("Stare curenta: pornita;");
		masina.setStareCurenta(StareMasina.gataDePlecare);
		
		assertEquals(StareMasina.gataDePlecare, masina.getStareCurenta());
		System.out.println("Stare curenta: gata de plecare;");
		masina.setStareCurenta(StareMasina.inDeplasare);
		
		assertEquals(StareMasina.inDeplasare, masina.getStareCurenta());
		System.out.println("Stare curenta: in deplasare;");
		masina.setStareCurenta(StareMasina.opritaDeUrgenta);
		
		assertEquals(StareMasina.opritaDeUrgenta, masina.getStareCurenta());
		System.out.println("Stare curenta: oprita de urgenta;");
		masina.setStareCurenta(StareMasina.stationata);
		
		assertEquals(StareMasina.stationata, masina.getStareCurenta());
		System.out.println("Stare curenta: stationata;");
		masina.setStareCurenta(StareMasina.inDeplasare);
		
		assertEquals(StareMasina.inDeplasare, masina.getStareCurenta());
		System.out.println("Stare curenta: in deplasare;");
		masina.setStareCurenta(StareMasina.oprita);
		
		assertEquals(StareMasina.oprita, masina.getStareCurenta());
		System.out.println("Stare curenta: oprita;");
		masina.setStareCurenta(StareMasina.ajunsaLaDestinatie);
		
		assertEquals(StareMasina.ajunsaLaDestinatie, masina.getStareCurenta());
		System.out.println("Stare curenta: ajunsa la destinatie;");
	}
}
