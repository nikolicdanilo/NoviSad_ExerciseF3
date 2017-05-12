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
	public void test_executeCommandBBorderCase() {
		vozilo = new PlanetExplorer(100,100);
		String ocekivaniIspis="(0, 100, N)";
		
		assertEquals(ocekivaniIspis,vozilo.executeCommand("b"));
		
	}
	@Test
	public void test_executeCommandBBorderCaseAndThenB() {
		vozilo = new PlanetExplorer(100,100);
		String ocekivaniIspis="(0, 99, N)";
		
		assertEquals(ocekivaniIspis,vozilo.executeCommand("bb"));
		
	}
	@Test
	public void test_executeCommandL() {
		vozilo = new PlanetExplorer(100,100);
		String ocekivaniIspis="(0, 0, W)";
		
		assertEquals(ocekivaniIspis,vozilo.executeCommand("l"));
		
	}
	@Test
	public void test_executeCommandR() {
		vozilo = new PlanetExplorer(100,100);
		String ocekivaniIspis="(0, 0, E)";
		
		assertEquals(ocekivaniIspis,vozilo.executeCommand("r"));
		
	}
	@Test
	public void test_executeMoreCommands() {
		vozilo = new PlanetExplorer(100,100);
		String ocekivaniIspis="(2, 2, E)";
		
		assertEquals(ocekivaniIspis,vozilo.executeCommand("ffrff"));
		
	}
}
