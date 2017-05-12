import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	PlanetExplorer vozilo;
	@Test
	public void test_executeCommandF() {
		vozilo = new PlanetExplorer(10,10);
		String ocekivaniIspis="(0, 1, N)";
		
		assertEquals(ocekivaniIspis,vozilo.executeCommand("f"));
		
	}
	
	@Test
	public void test_executeCommandFBorderCase() {
		vozilo = new PlanetExplorer(2,2);
		String ocekivaniIspis="(0, 0, N)";
		
		assertEquals(ocekivaniIspis,vozilo.executeCommand("fff"));
		
	}
	@Test
	public void test_executeCommandB() {
		vozilo = new PlanetExplorer(100,100);
		String ocekivaniIspis="(0, -1, N)";
		
		assertEquals(ocekivaniIspis,vozilo.executeCommand("b"));
		
	}
}
