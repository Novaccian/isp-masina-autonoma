package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import masina.*;
class TestPleaca {

	@Test
	void testDestLipsa() {
		Masina m = new Masina("BMW", 4, "ph 23 asd", TipCombustibil.benzina,StareMasina.gataDePlecare);
		Sofer s = new Sofer("Paul",629123,"B",12042017, m);
		
		assertFalse(s.pleaca());
		//Aici ar trebui sa ceara o destinatie
		assertTrue(s.pleaca());//iar aici reuseste
	}
	
	@Test
	void testCuDest() {
		Masina m = new Masina("BMW", 4, "ph 23 asd", TipCombustibil.benzina,StareMasina.stationata);
		Sofer s = new Sofer("Paul",629123,"B",12042017, m);
		s.seteazaDestinatie();
		assertTrue(s.pleaca());
	}
	
	@Test
	void testFaraCombustibil() {
		Masina m = new Masina("BMW", 4, "ph 23 asd", TipCombustibil.benzina,StareMasina.stationata);
		Sofer s = new Sofer("Paul",629123,"B",12042017, m);
		m.setProcentRezervor(0);
		assertFalse(s.pleaca());
	}
	
	@Test
	void testMasinaDefecta() {
		Masina m = new Masina("BMW", 4, "ph 23 asd", TipCombustibil.benzina,StareMasina.stationata);
		Sofer s = new Sofer("Paul",629123,"B",12042017, m);
		m.setService("defecta");
		assertFalse(s.pleaca());
	}
	
	@Test
	void testStareIncorecta() {
		Masina m = new Masina("BMW", 4, "ph 23 asd", TipCombustibil.benzina,StareMasina.oprita);
		Sofer s = new Sofer("Paul",629123,"B",12042017, m);
		assertFalse(s.pleaca());
	}
}
